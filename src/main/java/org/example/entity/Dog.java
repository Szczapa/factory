package org.example.entity;

public class Dog implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
