package org.example.interfaceSegregastion.example.good;

public class Chicken implements CanEat, CanWalk {

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
