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

    public double accelerate(double speed, double durationInHours) {

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

      return travelDistance;


    }







}