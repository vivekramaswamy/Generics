package generics.sort;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingWithLambdas {

    public static void main(String[] args) {


        List<String> stringList= Stream.of("Namaste", "Namaskara", "Sat sri akal", "hello").collect(Collectors.toList());



        List<String> sortedByLength=
                stringList.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());

        System.out.println(stringList);
        System.out.println(sortedByLength);


    }


}
