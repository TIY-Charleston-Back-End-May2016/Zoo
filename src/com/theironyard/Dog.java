package com.theironyard;

/**
 * Created by zach on 5/24/16.
 */
public class Dog extends Mammal {
    public Dog() {
        this.name = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
