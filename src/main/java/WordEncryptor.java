public class WordEncryptor {
    public static void main(String[] args) {
        String word = "ROADTOSDET";
        String encryptedWord = encryptWord(word, 'A', 'F');
        System.out.println("Encrypted word: " + encryptedWord);
    }

    public static String encryptWord(String word, char originalChar, char encryptedChar) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.toUpperCase(currentChar) == Character.toUpperCase(originalChar)) {
                if (Character.isUpperCase(currentChar)) {
                    encrypted.append(Character.toUpperCase(encryptedChar));
                } else {
                    encrypted.append(Character.toLowerCase(encryptedChar));
                }
            } else {
                encrypted.append(currentChar);
            }
        }

        return encrypted.toString();
    }
}
