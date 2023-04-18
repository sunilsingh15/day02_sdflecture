package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        MountainBike mountainBike = new MountainBike(5, 10, 20);
        System.out.println(mountainBike.toString());

        MountainBike mountainBike2 = new MountainBike(10, 00, 25);
        MountainBike mountainBike3 = new MountainBike(15, 30, 25);

        RoadBike roadBike = new RoadBike(15, 30, 25);

        List<Bicycle> bicycles = new ArrayList<Bicycle>();
        bicycles.add(mountainBike);
        bicycles.add(mountainBike2);
        bicycles.add(mountainBike3);
        bicycles.add(roadBike);

        for (Bicycle bicycle: bicycles) {
            if (bicycle instanceof MountainBike) {
                System.out.println(bicycle.hashCode() + " is a Mountain Bike");
            } else if (bicycle instanceof RoadBike) {
                System.out.println(bicycle.hashCode() + " is a Road Bike");
            }
        }
    }
}
