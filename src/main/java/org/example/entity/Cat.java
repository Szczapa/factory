package org.example.entity;

public class Cat implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
