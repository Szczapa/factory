package org.example;

import org.example.entity.IAnimal;
import org.example.factory.AnimalFactory;
import org.example.factory.CatFactory;
import org.example.factory.DogFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Factory pour créer un chat
        AnimalFactory catFactory = new CatFactory();
        IAnimal cat = catFactory.createAnimal();
        cat.makeSound();

        // Factory pour créer un chien
        AnimalFactory dogFactory = new DogFactory();
        IAnimal dog = dogFactory.createAnimal();
        dog.makeSound();
    }
}