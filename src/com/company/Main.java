package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Hachiko";
        dog.weight = 5.0;
//        System.out.println(dog.species);
//        System.out.println(dog.name);
//        System.out.println(dog.weight);
//        dog.feed(1.5);
//        System.out.println(dog.weight);

//        Phone onePlus = new Phone();
//        onePlus.producer = "1+";
//        onePlus.model = "8T";
//        onePlus.screenSize = 6.0;
//
//        Human me = new Human();
//        me.firstName = "Konrad";
//        me.lastName = "Markiewicz";
//        me.pet = dog;
//        System.out.println(me.firstName);
//        System.out.println(me.lastName);
//        System.out.println(me.pet.species);

        Animal cat = new Animal("cat");
        while (cat.isAlive) {
            cat.takeForAWalk();
        }

    }
}
