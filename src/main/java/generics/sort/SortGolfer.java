package generics.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortGolfer {

    private static List<Golfer> golfers= Arrays.asList(
            new Golfer("Jack", "Nicaulus", 68),
            new Golfer("Tiger", "Woods", 70),
            new Golfer("Tom", "Watson", 70),
            new Golfer("Ty", "Web", 68),
            new Golfer("Bubba", "Watson", 70)
    );


    public static void main(String[] args) {

        golfers.stream().sorted(Comparator.comparing(Golfer::getScore)
                .thenComparing(Golfer::getFirst)).forEach(System.out::println);

        
    }
}
