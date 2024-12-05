package org.example.factory;

import org.example.entity.IAnimal;
import org.example.entity.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}
