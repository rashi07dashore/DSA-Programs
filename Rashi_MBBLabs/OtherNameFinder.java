import java.util.Scanner;

public class OtherNameFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();

        String otherName = findOtherName(name);
        System.out.println("Your other name is: " + otherName);
    }

    public static String findOtherName(String name) {
        StringBuilder otherNameBuilder = new StringBuilder();

        for (char letter : name.toCharArray()) {
            if (Character.isLowerCase(letter)) {
                char otherLetter = (char) ('z' - (letter - 'a'));
                otherNameBuilder.append(otherLetter);
            } else if (Character.isUpperCase(letter)) {
                char otherLetter = (char) ('Z' - (letter - 'A'));
                otherNameBuilder.append(otherLetter);
            } else {
                otherNameBuilder.append(letter);
            }
        }

        return otherNameBuilder.toString();
    }
}
