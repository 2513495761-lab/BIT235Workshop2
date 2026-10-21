/**
 * Exercise 1.4 - Compound interest
 *
 * A = P * (1 + r)^n
 *   A = amount
 *   r = interest rate per time period
 *   n = number of time periods
 *
 * Given: P = $5000.00 investment, r = 4% interest per year, n = 10 years.
 * Hint: To calculate power multipliers use Math.pow(i, n), which is the equivalent of i^n.
 */
public class Exercise1_4 {

    public static void main(String[] args) {
        double principal = 5000.00;   // P
        double rate = 0.04;           // r = 4% per year (as a decimal)
        int years = 10;               // n

        // TODO: calculate A = P * (1 + r)^n using Math.pow(1 + rate, years)
        double amount = 0; // replace 0 with the calculation

        // TODO: display the result. Tip: printf can round to 2 decimals:
        //       System.out.printf("Amount after %d years: $%.2f%n", years, amount);
    }
}
