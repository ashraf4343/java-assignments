import java.util.HashMap;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};

        HashMap<Integer, Integer> numberPositions = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (numberPositions.containsKey(number)) {
                System.out.println("Duplicate value: " + number + " at index " + i);
            } else {
                numberPositions.put(number, i);
            }
        }
    }
}

