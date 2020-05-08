package com.pechnicki.observerpattern;

public class UserInterface extends Observer{
    WeatherStation weatherStation;

    public void display(){
        System.out.println("Display something");
    }


    @Override
    public void update(){
        System.out.println("UserInterface updated");
    }
}
