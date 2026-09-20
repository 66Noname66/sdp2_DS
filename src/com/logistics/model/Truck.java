package com.logistics.model;

public class Truck implements Transport{
    @Override
    public void deliver(String cargo, String destination) {
        System.out.printf("Truck delivers %s to %s%n", cargo, destination);
    }
}
