package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the racing game" );

        Car carRefrence = new Car();
        carRefrence.name = "Audi";
        carRefrence.color = "red";
        carRefrence.maxSpead = 260;
        carRefrence.mileage = 6.2;

       // concatenation
        System.out.println("Properties of " + carRefrence.name);
        // Color: red
        System.out.println("Color: " + carRefrence.color);
        System.out.println("Max spead: " + carRefrence.maxSpead);
        System.out.println("Mileage: " + carRefrence.mileage);
        System.out.println("Racing number: "+ carRefrence.racingNumber);
        System.out.println("Damaged: " + carRefrence.damaged);
        System.out.println("Fuel level "+  carRefrence.fuelLevel);

     carRefrence = null

        Car  car2 = new Car ();
        car2.name = "Lambourghini";
        car2.damaged = true;

        System.out.println("Properties of" + car2.name);
        System.out.println("Color:" + car2.color);
        System.out.println("Damaged:" +car2.damaged);


    }
}
