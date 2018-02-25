package generics.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.*;


public class MaxEmployees {

    public static List<Employee> createEmployees(){

        return Arrays.asList(
                new Employee(1, "Vaibhav"),
                new Employee(2, "Sumit"),
                new Employee(3, "Anwar"),
                new Employee(4, "Rajesh"),
                new Employee(5, "Madhusudhan")
        );

    }

    public static void main(String[] args) {

        Comparator<Employee> byId=(Employee e1, Employee e2)->e1.getId()-e2.getId();
        Comparator<Object> byName=(Object e1, Object e2)->e1.toString().compareTo(e2.toString());

        List<Employee> employees=createEmployees();

        Employee maxId=employees.stream().max(byId).orElse(Employee.DEFAULT_EMPLOYEE);
        Employee maxName=employees.stream().max(byName).orElse(Employee.DEFAULT_EMPLOYEE);


        System.out.println("Max employee by ID: "+ maxId);
        System.out.println("Max employee by Name: "+ maxName);


        maxId=employees.stream().max(comparingInt(Employee::getId)).orElse(Employee.DEFAULT_EMPLOYEE);
        maxName=employees.stream().max(comparing(Object::toString)).orElse(Employee.DEFAULT_EMPLOYEE);

        System.out.println("Max employee by ID: "+ maxId);
        System.out.println("Max employee by Name: "+ maxName);


    }

}
