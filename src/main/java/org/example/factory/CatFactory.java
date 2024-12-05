package org.example.factory;

import org.example.entity.Animal;
import org.example.entity.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
