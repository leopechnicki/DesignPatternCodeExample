package com.pechnicki.builderpattern;

public class BuilderPattern{
    public static void main(String[] args){
        Customer customer = new Customer("Michal", 42);
        /*Not able to use customer.setName("Test");*/
    }
}
