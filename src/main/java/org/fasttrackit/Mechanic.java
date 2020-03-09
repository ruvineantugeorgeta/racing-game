package org.fasttrackit;

public class Mechanic {
    public  void repair(Vehicle vehicle) {
        System.out.println("Reapiring vehicle" + vehicle.name);

        vehicle.totalDistance --;
        vehicle.damaged = false;
    }
}
