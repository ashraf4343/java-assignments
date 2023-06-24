import java.util.Scanner;

public class NumberSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean shouldQuit = false;

        while (!shouldQuit) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                shouldQuit = true;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
                }
            }
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
