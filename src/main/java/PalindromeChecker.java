public class PalindromeChecker {
    public static void main(String[] args) {
        String input1 = "Civic";
        String input2 = "One";

        System.out.println(input1 + " is a palindrome: " + isPalindrome(input1));
        System.out.println(input2 + " is a palindrome: " + isPalindrome(input2));
    }

    public static boolean isPalindrome(String str) {
        // Remove any non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

