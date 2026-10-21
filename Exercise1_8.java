import java.util.Scanner;

/**
 * Exercise 1.8 - Compare two strings
 *
 * A user will enter two Strings (import Scanner).
 * The program compares both strings and displays the result
 * "the two given strings are equal" True/False based on the comparison.
 * The program also compares the first character of each String.
 *
 * Hint: use equals(Object anObject) and charAt(int index).
 */
public class Exercise1_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        // TODO: compare the whole strings with s1.equals(s2) and print the result, e.g.
        //       System.out.println("the two given strings are equal: " + s1.equals(s2));
        // WATCH OUT: use .equals(), not == (== compares object references, not content).

        // TODO: compare the first character of each string with charAt(0)
        //       char first1 = s1.charAt(0);
        //       char first2 = s2.charAt(0);
        //       then print whether first1 == first2
        // (Tip: guard against empty strings to avoid a crash.)
    }
}
