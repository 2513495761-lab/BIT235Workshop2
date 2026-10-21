/**
 * Exercise 1.6 - Fuel consumption
 *
 * A motor car uses 8 litres of fuel per 100 kilometres of normal road
 * and 15% more fuel on rough roads.
 *
 * Write a Java program to calculate and display the distance the car can travel
 * on a full tank of 40 litres of fuel on both normal and rough roads.
 */
public class Exercise1_6 {

    public static void main(String[] args) {
        double tankLitres = 40;              // full tank
        double normalPer100km = 8;           // litres per 100 km on normal road

        // TODO: rough-road consumption is 15% more than normal:
        //       roughPer100km = normalPer100km * 1.15

        // TODO: distance = tankLitres / consumptionPer100km * 100
        //       calculate it once for normal road and once for rough road

        // TODO: display both distances, e.g.
        //       System.out.println("Normal road: " + normalDistance + " km");
        //       System.out.println("Rough road:  " + roughDistance + " km");
    }
}
