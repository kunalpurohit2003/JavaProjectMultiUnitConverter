// Java program for the conversion
// kmph to mph and vice versa

import java.io.*;

class GFG {
 

    // Function to convert kmph to mph

    static double kmphTOmph(double kmph)

    {

        return 0.6214 * kmph;

    }
 

    // Function to convert mph to kmph

    static double mphTOkmph(double mph)

    {

        return mph * 1.60934;

    }

    // Driver code to check the above function

    public static void main(String[] args)

    {

        double kmph = 150;

        double mph = 100;

        System.out.println("speed in miles/hr is " + kmphTOmph(kmph));

        System.out.println("speed in km/hr is " + mphTOkmph(mph));

    }
}