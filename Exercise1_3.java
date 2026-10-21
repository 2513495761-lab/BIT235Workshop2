/**
 * Exercise 1.3 - Area of a circle
 *
 * Area = pi * radius * radius, with pi = 3.14.
 * Try it with several different values for the radius.
 */
public class Exercise1_3 {

    public static void main(String[] args) {
        double pi = 3.14;

        System.out.println("Area of a circle (pi = 3.14)");
        System.out.printf("%8s | %12s%n", "Radius", "Area");
        System.out.println("-----------------------------");

        // Try several radii: 1, 4, 7 and 10
        for (double radius = 1; radius <= 10; radius = radius + 3) {
            double area = pi * Math.pow(radius, 2);
            System.out.printf("%8.1f | %12.2f%n", radius, area);
        }
    }
}
