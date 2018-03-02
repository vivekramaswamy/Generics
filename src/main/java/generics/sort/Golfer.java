package generics.sort;

import java.util.stream.Stream;

public class Golfer implements Comparable<Golfer> {

    private String first;
    private String last;
    private int score;

    Golfer(){}

    public Golfer(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Golfer(String first, String last, int score) {
        this.first = first;
        this.last = last;
        this.score = score;
    }

    @Override
    public int compareTo(Golfer golfer) {
        return score-golfer.score;
    }


    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Golfer{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", score=" + score +
                '}';
    }
}
