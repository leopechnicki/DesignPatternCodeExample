package com.pechnicki.decoratorpattern;

public class Cheese extends Topping{
    Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription().concat(", Cheese");
    }

    @Override
    public Double cost(){
        return pizza.cost() + 4.00;
    }
}
