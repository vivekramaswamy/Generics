package start;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Wildcard {


    public static Double sumIt(List<? extends Number> numberList){
        return numberList.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }
    public static void main(String[] args) {


        List<Number> numberList= Arrays.asList(1,2,3,4,5);
        System.out.println(sumIt(numberList));

        List<Integer> integerList=Arrays.asList(1,2,3,4,5);
        System.out.println(sumIt(integerList));

        List<Double> myDouble= DoubleStream.iterate(1.0, f->f+1.0)
                .limit(10)
                .mapToObj(Double::new)
                .collect(Collectors.toList());

        myDouble.forEach(System.out::println);


        List<String> myStr= Stream.of("Hello","World", "Peace").collect(Collectors.toList());

        myStr.forEach((Object a)-> System.out.println(a.hashCode()));
        myStr.forEach(System.out::println);



        List<Integer> integerList1=Stream.of(1,2,3,4,5)
                .peek((Number n)-> System.out.println("The double value is "+ n.doubleValue()))
                .peek((Object o)-> System.out.println("The hash is "+ o.hashCode()))
                .peek(i-> System.out.println("Calling int function "+Integer.toBinaryString(i)))
                .collect(Collectors.toList());



    }

}
