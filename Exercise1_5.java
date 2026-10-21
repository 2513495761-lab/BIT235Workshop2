/**
 * Exercise 1.5 - Volumes of the Earth and the Sun
 *
 * Sun diameter = 865,000 miles, Earth diameter = 7,600 miles.
 * Volume of a sphere = (4/3) * pi * r^3, with r = diameter / 2 and pi = 3.14.
 *
 * Note: 4.0 / 3.0 is used (not 4 / 3, which would be integer division = 1).
 */
public class Exercise1_5 {

    public static void main(String[] args) {
        double pi = 3.14;

        double earthDiameter = 7600;
        double sunDiameter = 865000;

        double earthRadius = earthDiameter / 2;
        double sunRadius = sunDiameter / 2;

        double earthVolume = (4.0 / 3.0) * pi * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * pi * Math.pow(sunRadius, 3);

        double ratio = sunVolume / earthVolume;

        System.out.printf("a) Volume of the Earth: %.2f cubic miles%n", earthVolume);
        System.out.printf("b) Volume of the Sun:   %.2f cubic miles%n", sunVolume);
        System.out.printf("c) Ratio Sun / Earth:   %.2f%n", ratio);
    }
}
