package com.pechnicki.decoratorpattern;

public class ThickCrustPizza extends Pizza{
    public String getDescription(){
        return description = "ThickCrustPizza";
    }

    @Override
    public Double cost(){
        return 15.00;
    }
}
