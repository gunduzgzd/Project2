package org.example.interfaceSegregastion.example.bad;

public class Eagle implements Bird{

    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }

    @Override
    public void fly() {
        System.out.println("Flying.");
    }

}
