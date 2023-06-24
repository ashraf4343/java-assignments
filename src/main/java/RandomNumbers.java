import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        // Generate random numbers and populate the array
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Generate random numbers between 0 and 99
        }

        // Print all the numbers from the array
        System.out.println("All numbers from the array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the maximum and minimum number from the array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Print the maximum and minimum numbers
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
