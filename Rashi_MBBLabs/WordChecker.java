import java.util.Scanner;

public class WordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        if (isCorrectWord(word)) {
            System.out.println("The word is correct.");
        } else {
            System.out.println("The word is incorrect.");
        }
    }

    public static boolean isCorrectWord(String word) {
        // Check for characters other than alphabets and numbers
        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Check for consecutive characters that are the same
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return false;
            }
        }

        // If no issues were found, the word is correct
        return true;
    }
}
