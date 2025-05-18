import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Array after removing duplicates: " + uniqueNumbers);
    }
}
