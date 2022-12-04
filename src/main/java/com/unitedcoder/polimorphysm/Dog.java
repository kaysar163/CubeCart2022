package com.unitedcoder.polimorphysm;

public class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("the dag make sounds like  wof woof ");
    }
    public  void animalEat(String foodName){
        System.out.println("the dog eats "+foodName);
}
public void dogRun(){
    System.out.println("dog is running ");
}
}
