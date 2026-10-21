import java.util.Scanner;

/**
 * Exercise 1.2 - Celsius to Fahrenheit
 *
 * Write a Java program covered in class to convert degrees Celsius to degrees Fahrenheit.
 * Hint: Use the formula F = C * 9 / 5 + 32
 */
public class Exercise1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // TODO: convert Celsius to Fahrenheit using F = C * 9 / 5 + 32
        // WATCH OUT: if you use int for celsius, 9/5 is integer division (= 1)!
        //            Keep the input as double (or cast to double) so the result is correct.
        double fahrenheit = 0; // replace 0 with the calculation

        // TODO: display the result, e.g.
        //       System.out.println(celsius + " C = " + fahrenheit + " F");
    }
}
