public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;

        boolean found = false;
        int index = -1;

        // Linear search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Key found at index " + index);
        } else {
            System.out.println("Key not found in the array");
        }
    }
}
