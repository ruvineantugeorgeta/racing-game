package org.fasttrackit;

public class Vehicle {

    // instance variables
    int racingNumber;
    String name;
    int maxSpead;
    double mileage;
    String color;
    double fuelLevel;
    double totalDistance ;
    boolean damaged;
    double durationInHours;
    int speed;


    public double accelerate(double speed, double durationInHours) {
        if (fuelLevel <= 0) {
            System.out.println("Not enough fuel.");
            return 0;
        }

        if (maxSpead > speed) {
            System.out.println("Max spead exceedde!");
            return 0;
        } else if (speed == maxSpead){
            System.out.println("Be careful! Max speed reched!");
        } else {
            System.out.println("Valid speed entered");
            // todo: use more fuel if speed > 120
        }
            System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + "h");
        return 0;
        }

    {

        System.out.println(name + " is accelerating whith " + speed + "km/h for " + durationInHours + " h ");

        // local variable
        double travelDistance = speed * durationInHours;

        System.out.println("Traveled distance : " + travelDistance);


        totalDistance += travelDistance;
        System.out.println("Total traveled distance: "+ travelDistance);

        double usedFuel = travelDistance * mileage / 100;
        fuelLevel = fuelLevel - usedFuel;

        // same result as the instruction above
      //  fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);




    }


  public void  decelerate () {
        // TODO : implement this
        System.out.println("This is just a demo method");
    }




}