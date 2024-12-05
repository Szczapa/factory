package org.example.factory;

import org.example.entity.IAnimal;
import org.example.entity.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }
}
