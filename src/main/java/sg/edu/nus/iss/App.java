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

        List<MountainBike> bicycles = new ArrayList<MountainBike>();
        bicycles.add(mountainBike);
        bicycles.add(mountainBike2);
        bicycles.add(mountainBike3);

        for (MountainBike mb: bicycles) {
            System.out.println(mb.toString());
        }
    }
}
