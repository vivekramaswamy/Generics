package generics.sort;


import generics.max.Employee;
import generics.max.MaxEmployees;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingWithLambdas {

    public static void main(String[] args) {


        List<String> stringList= Stream.of("Namaste", "Namaskara", "Sat sri akal", "hello").collect(Collectors.toList());




        List<String> sortedByLength=
                stringList.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());

        System.out.println(stringList);
        System.out.println(sortedByLength);


        //Calculate the sum of the length
        //Consumption always uses Super and Producer uses extends PECS
        //? is a unbounded wildcard
        Integer length= MaxEmployees.createEmployees().stream().map(Employee::getName).mapToInt(String::length).sum();

        System.out.println("The total number of letters in the input are: "+ length);

        //Create a map of employee, where the key is the id and the value is the employee name

        Map<Integer, Employee> employeeMap=
                MaxEmployees.createEmployees().stream()
                .collect(Collectors.toMap(e->e.getId()*9, Function.identity()));

        employeeMap.forEach((id, e)-> System.out.println("The id is: "+ id + " The employee is:  "+ e));


        //Sorting employees by keys
        System.out.println("Sorting by natural order");
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry-> System.out.println("The id is: "+ entry.getKey()+ " The value is: "+ entry.getValue()));

        System.out.println("Sorting by reverse natural order");
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(entry-> System.out.println("The id is: "+ entry.getKey()+ " The value is: "+ entry.getValue()));


        //Sorting employee by value
        System.out.println("Sorting by value");
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
                .forEach(entry-> System.out.println("The id is: "+ entry.getKey()+ " The value is: "+ entry.getValue()));


    }


}
