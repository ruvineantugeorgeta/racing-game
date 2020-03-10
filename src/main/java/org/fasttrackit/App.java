package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner (System.in);
       String vehicleName = scanner.nextLine();
        System.out.println("Entered name:" + vehicleName);

        System.out.println( "Welcome to the racing game" );

        Car carRefrence = new Car();
        carRefrence.name = "Audi";
        carRefrence.color = "red";
        carRefrence.maxSpead = 260;
        carRefrence.mileage = 6.2;
        carRefrence.fuelLevel = 100;
        carRefrence.damaged = true;

//        carRefrence.engine =new Engine();
//        carRefrence.engine.manufactures = "VW";
//        carRefrence.engine.capacity = 2000;

        Engine engine1 =new Engine();
        engine1.manufactures = "VW";
        engine1.capacity = 2000;

        carRefrence.engine = engine1;

       double currentDistance =  carRefrence.accelerate(60, 1);
        System.out.println("Current distanece: " + currentDistance);

        Mechanic mechanic = new Mechanic();
         mechanic.repair(carRefrence);
        System.out.println("Is car demaged? " + carRefrence.damaged);

     // one object with two references

        System.out.println("Engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carRefrence.engine.capacity);

         engine1.capacity = 2100;

        System.out.println("Updated engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carRefrence.engine.capacity);



       // concatenation
        System.out.println("Properties of " + carRefrence.name);
        // Color: red
        System.out.println("Color: " + carRefrence.color);
        System.out.println("Max spead: " + carRefrence.maxSpead);
        System.out.println("Max spead: " + carRefrence.maxSpead);
        System.out.println("Mileage: " + carRefrence.mileage);
        System.out.println("Racing number: "+ carRefrence.racingNumber);
        System.out.println("Damaged: " + carRefrence.damaged);
        System.out.println("Fuel level "+  carRefrence.fuelLevel);

     carRefrence = null;

        Car  car2 = new Car ();
        car2.name = "Lambourghini";
        car2.damaged = true;


        System.out.println("Properties of" + car2.name);
        System.out.println("Color:" + car2.color);
        System.out.println("Damaged:" +car2.damaged);
// modulus (modulo) operator
//       System.out.println(4 % 2 == 0);
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);


    }
}
