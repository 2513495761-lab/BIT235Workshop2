/**
 * Exercise 1.6 - Fuel consumption
 *
 * 8 litres per 100 km on normal road, 15% more on rough roads.
 * Full tank = 40 litres. Calculate the distance on both roads.
 */
public class Exercise1_6 {

    public static void main(String[] args) {
        double tankLitres = 40;          // full tank
        double normalPer100km = 8;       // litres per 100 km, normal road

        // Rough road uses 15% more fuel
        double roughPer100km = normalPer100km * 1.15;

        // distance = tank / consumption per 100 km * 100
        double normalDistance = tankLitres / normalPer100km * 100;
        double roughDistance = tankLitres / roughPer100km * 100;

        System.out.printf("On normal roads: %.2f km%n", normalDistance);
        System.out.printf("On rough roads:  %.2f km%n", roughDistance);
    }
}
