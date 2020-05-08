package com.pechnicki.AdapterPattern;

public class DuckSimulator{
    public static void main(String[] args){
        Drone drone = new SuperDrone();
        testDuck(new DroneAdapter(drone));
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
