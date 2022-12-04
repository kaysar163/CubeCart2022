package com.unitedcoder.polimorphysm;

public class Cat extends  Animal{
    @Override
    public void animalSound() {
        System.out.println("the cat says mewo meow");
    }
    public  void animalEat(String foodName){
       System.out.println("the cat eats "+foodName);
    }
    public void catRun(){
        System.out.println("the cat is ronning ");

    }
}
