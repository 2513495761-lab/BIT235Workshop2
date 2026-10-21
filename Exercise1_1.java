import java.util.Scanner;

/**
 * Exercise 1.1 - Difference of two numbers
 *
 * Write a Java program to display the result of difference of two numbers.
 * A user will enter two integers (import Scanner).
 * Program will calculate their difference.
 * Program then displays the result.
 */
public class Exercise1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        // Difference = first number minus second number
        int difference = first - second;

        System.out.println("The difference between " + first + " and " + second
                + " is: " + difference);
    }
}
