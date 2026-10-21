/**
 * Exercise 1.5 - Volumes of the Earth and the Sun
 *
 * The diameter of the Sun is approximately 865,000 miles.
 * The diameter of the Earth is approximately 7,600 miles.
 *
 * Use the methods in the Math class to calculate and display:
 *   a) the volume of the Earth in cubic miles
 *   b) the volume of the Sun in cubic miles
 *   c) the ratio of the volume of the Sun to the volume of the Earth
 *
 * Volume of a sphere = (4/3) * pi * r^3, where r = diameter / 2 and pi = 3.14.
 * Hint: To calculate the cube use Math.pow(i, 3), which is the equivalent of i^3.
 * WATCH OUT: (4/3) with ints is 1 (integer division). Use 4.0 / 3 so the result is a decimal.
 */
public class Exercise1_5 {

    public static void main(String[] args) {
        double pi = 3.14;
        double earthDiameter = 7600;
        double sunDiameter = 865000;

        // TODO: radius = diameter / 2 for both (keep them as double)
        // TODO: volume = (4.0 / 3) * pi * Math.pow(radius, 3) for both
        // TODO: print:
        //       a) the volume of the Earth
        //       b) the volume of the Sun
        //       c) the ratio sunVolume / earthVolume
    }
}
