public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 7, 4, 1, 8};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number < max) {
                secondMax = number;
            }
        }

        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("Second largest element: " + secondMax);
        } else {
            System.out.println("No second largest element found in the array");
        }
    }
}
