public class StringStats {
    public static void main(String[] args) {
        String sentence = "I live in Bangladesh";

        int wordCount = countWords(sentence);
        int charCountWithoutSpaces = countCharactersWithoutSpaces(sentence);
        int vowelCount = countVowels(sentence);
        int consonantCount = countConsonants(sentence);

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters without spaces: " + charCountWithoutSpaces);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static int countCharactersWithoutSpaces(String sentence) {
        String stringWithoutSpaces = sentence.replaceAll("\\s+", "");
        return stringWithoutSpaces.length();
    }

    public static int countVowels(String sentence) {
        int vowelCount = 0;
        String lowerCaseSentence = sentence.toLowerCase();

        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            char ch = lowerCaseSentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static int countConsonants(String sentence) {
        int consonantCount = 0;
        String lowerCaseSentence = sentence.toLowerCase();

        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            char ch = lowerCaseSentence.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                consonantCount++;
            }
        }

        return consonantCount;
    }
}
