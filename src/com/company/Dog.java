package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

//specifying super will always go to the class that you are extending from and look for the method.  If you do not specify it will look in the local class first and then look in the parent class.
    @Override
    public void move(int speed){
        System.out.println("Dog move func");
        if(speed > 10){
            super.move(100);
        } else {
            super.move(10);
        }
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
