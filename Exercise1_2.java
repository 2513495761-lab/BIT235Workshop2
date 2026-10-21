import java.util.Scanner;

/**
 * Exercise 1.2 - Celsius to Fahrenheit
 *
 * Convert degrees Celsius to degrees Fahrenheit.
 * Formula: F = C * 9 / 5 + 32
 */
public class Exercise1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        // double (not int) so that 9/5 does not become integer division
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.println(celsius + " degrees Celsius = " + fahrenheit
                + " degrees Fahrenheit");
    }
}
