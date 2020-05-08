package com.pechnicki.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Subject{
    private String temperature;
    private String windSpeed;
    private String pressure;
    private List<Observer> observersList;


    @Override
    public void registerObserver(Observer o){
        if(null == observersList){
            observersList = new ArrayList<Observer>();
        }
        observersList.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observersList.remove(o);
    }

    @Override
    public void notifyObserver(){
        for(Observer observer : observersList){
            observer.update();
        }
    }
}
