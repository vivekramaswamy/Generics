package start;

import java.util.Arrays;
import java.util.List;

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

    }

}
