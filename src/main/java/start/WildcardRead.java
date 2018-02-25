package start;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class WildcardRead {

    public static void main(String[] args) {

        List<?> wildcardList= Arrays.asList("Hello", 1, LocalTime.now());

        System.out.println(wildcardList.size());
        wildcardList.forEach((Object o)-> System.out.println(o));

        wildcardList.containsAll(Arrays.asList("Hello",1));


    }
}
