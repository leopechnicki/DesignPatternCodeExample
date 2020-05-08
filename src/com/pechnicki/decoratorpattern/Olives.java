package com.pechnicki.decoratorpattern;

public class Olives extends Topping{
    Pizza pizza;

    public Olives(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return this.pizza.getDescription().concat(", Olives");
    }

    @Override
    public Double cost(){
        return this.pizza.cost() + 3.00;
    }
}
