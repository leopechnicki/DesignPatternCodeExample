package com.pechnicki.observerpattern;

public abstract class Subject{
    public abstract void registerObserver(Observer o);
    public abstract void removeObserver(Observer o);
    public abstract void notifyObserver();
}
