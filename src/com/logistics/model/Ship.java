package com.logistics.model;

public class Ship implements Transport{
    @Override
    public void deliver(String cargo, String destination) {
        System.out.printf("Truck delivers %s to %s%n", cargo, destination);
    }
}
