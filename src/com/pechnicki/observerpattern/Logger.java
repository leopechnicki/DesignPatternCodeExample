package com.pechnicki.observerpattern;

public class Logger extends Observer{
    @Override
    public void update(){
        System.out.println("Logger updated");
    }
}
