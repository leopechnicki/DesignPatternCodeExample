package com.pechnicki.decoratorpattern;

public class ThinCrustPizza extends Pizza{
    @Override
    public String getDescription(){
        return description = "ThinCrustPizza";
    }

    @Override
    public Double cost(){
        return 20.00;
    }
}
