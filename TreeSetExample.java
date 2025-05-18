import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(92);
        scores.add(75);
        scores.add(85); // Duplicate

        System.out.println("Sorted Scores:");
        for (int score : scores) {
            System.out.println(score);
        }
    }
}

