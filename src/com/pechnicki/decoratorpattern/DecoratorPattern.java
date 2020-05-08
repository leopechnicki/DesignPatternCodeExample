package com.pechnicki.decoratorpattern;

public class DecoratorPattern{
    public static void main(String[] args){
        Pizza pizza = new ThinCrustPizza();
        pizza = new Olives(pizza);
        pizza = new Cheese(pizza);

        System.out.println(pizza.toString());
    }
}
