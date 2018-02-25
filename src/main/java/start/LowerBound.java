package start;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LowerBound {

    public static void main(String[] args) {

        List<String> stringList= Stream.of("Hello", "World", "Welcome")
                .collect(Collectors.toList());

        stringList.forEach((String s)-> System.out.println("Upper case is: "+ s.toUpperCase()));
        stringList.forEach((Object o)->System.out.println("The hashcode is: "+ o.hashCode()));


        /**
         * peek takes in a consumer (? super T) This means that I can call
         * not just the methods on T, but all ancestors of T as well.
         */
        List<Integer> integerList=Stream.of(1,2,3,4,5)
                .peek((Integer e)-> System.out.println("As binary String "+ Integer.toBinaryString(e)))
                .peek((Number n)-> System.out.println("Double value of this "+ n.doubleValue()))
                .peek((Object o)-> System.out.println("Hashcode of this value "+ o.hashCode()))
                .collect(Collectors.toList());
        System.out.println(integerList);



    }

}
