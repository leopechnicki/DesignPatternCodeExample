package com.pechnicki.decoratorpattern;

public abstract class Pizza{
    String description = "Something";

    public String getDescription(){
        return description;
    }

    public abstract Double cost();

    @Override
    public String toString(){
        return "Pizza{" +
                "description='" + getDescription() + '\'' +
                ", cost='" + cost() + '\'' +
                '}';
    }
}
