package com.pechnicki.AdapterPattern;

public class DroneAdapter extends Duck{
    Drone drone;

    public DroneAdapter(Drone drone){
        this.drone = drone;
    }

    @Override
    public void quack(){
        drone.beep();
    }

    @Override
    public void fly(){
        drone.spin_rotors();
        drone.take_off();
    }
}
