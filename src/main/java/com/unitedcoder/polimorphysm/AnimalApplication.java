package com.unitedcoder.polimorphysm;

import org.checkerframework.checker.units.qual.A;

public class AnimalApplication {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.animalSound();
        animal.animalEat("animal foods");

        Cat cat=new Cat();
        cat.animalSound();
        cat.animalEat("cat food");
        cat.animalsleep();

        Dog dog=new Dog();
        dog.animalSound();
        dog.animalEat("boen");
        dog.animalsleep();

        System.out.println("cat object with animal object refernce");
        Animal c=new Cat();
        c.animalEat("food");
        c.animalSound();

        Animal d=new Dog();
        d.animalSound();
        d.animalEat("god food");
        d.animalsleep();


    }
}
