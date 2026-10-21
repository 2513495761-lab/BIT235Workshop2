import java.util.Scanner;

/**
 * Exercise 1.8 - Compare two strings
 *
 * A user enters two Strings (Scanner).
 * The program compares both strings and displays
 * "the two given strings are equal" True/False.
 * The program also compares the first character of each String.
 */
public class Exercise1_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        // equals() compares the CONTENT of the strings (== would compare references)
        boolean equal = s1.equals(s2);
        System.out.println("the two given strings are equal: " + equal);

        // Compare the first character of each string
        if (s1.length() == 0 || s2.length() == 0) {
            System.out.println("Cannot compare first characters: one of the strings is empty.");
        } else {
            char first1 = s1.charAt(0);
            char first2 = s2.charAt(0);

            System.out.println("First character of the first string:  '" + first1 + "'");
            System.out.println("First character of the second string: '" + first2 + "'");
            System.out.println("The first characters are the same: " + (first1 == first2));
        }
    }
}
