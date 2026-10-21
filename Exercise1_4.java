/**
 * Exercise 1.4 - Compound interest
 *
 * A = P * (1 + r)^n
 *   P = $5000.00, r = 4% per year, n = 10 years
 */
public class Exercise1_4 {

    public static void main(String[] args) {
        double principal = 5000.00;   // P
        double rate = 0.04;           // r = 4% per year as a decimal
        int years = 10;               // n

        // Math.pow(1 + rate, years) is (1 + r)^n
        double amount = principal * Math.pow(1 + rate, years);

        System.out.printf("Principal:       $%.2f%n", principal);
        System.out.println("Interest rate:   4% per year");
        System.out.println("Time:            10 years");
        System.out.printf("Amount (A):      $%.2f%n", amount);
        System.out.printf("Interest earned: $%.2f%n", amount - principal);
    }
}
