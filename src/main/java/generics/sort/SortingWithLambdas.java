package generics.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortingWithLambdas {

    private List<String> stringList= Arrays.asList("This", "is", "a", "list", "of", "string");


    //Default sort from Java 7;
    public List<String> alphaSort() {
        Collections.sort(stringList);
        return stringList;
    }

    //Default sort of Java 8;

    public List<String> alpaSortUsingStream() {
        return stringList.stream().sorted().collect(toList());
    }


}
