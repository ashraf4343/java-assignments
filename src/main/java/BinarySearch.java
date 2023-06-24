
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;

        // Sort the array before performing binary search
        java.util.Arrays.sort(numbers);

        int index = binarySearch(numbers, key);

        if (index != -1) {
            System.out.println("Key found at index " + index);
        } else {
            System.out.println("Key not found in the array");
        }
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid;  // Key found at index 'mid'
            } else if (array[mid] < key) {
                low = mid + 1;  // Search in the right half
            } else {
                high = mid - 1;  // Search in the left half
            }
        }

        return -1;  // Key not found in the array
    }
}
