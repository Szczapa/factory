package org.example.factory;

import org.example.entity.Animal;
import org.example.entity.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
