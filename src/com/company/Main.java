package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1,1,5,5);

        //create new dog that extends animal. and print the weight value
        Dog dog = new Dog ("Doggie", 50, 75, 2, 4, 1, 22, "Fluffy");
        System.out.println("dog weight " + dog.getWeight());

        //run the animal.eat function and have it change weight, get weight again.
        dog.eat();
        System.out.println(dog.getWeight());

        //run dog.move and see what the animal.move console logs
        dog.move(50);
        dog.move(9);
    }
}
