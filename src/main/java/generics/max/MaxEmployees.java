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


        Employee maxId=createEmployees().stream().max((emp1, emp2)->emp1.getId()-emp2.getId())
                .orElse(Employee.DEFAULT_EMPLOYEE);

        Employee maxName=createEmployees().stream().max((Object o1, Object o2)->
        o1.toString().compareTo(o2.toString())).orElse(Employee.DEFAULT_EMPLOYEE);



        System.out.println(String.format("Max id is %s and the Max name is %s", maxId, maxName));

        maxId=createEmployees().stream().max(comparing(Employee::getId))
                .orElse(Employee.DEFAULT_EMPLOYEE);
        maxName=createEmployees().stream().max(comparing(Object::toString))
                .orElse(Employee.DEFAULT_EMPLOYEE);







    }

}
