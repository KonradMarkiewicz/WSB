package com.company;

import java.io.File;

import static java.util.Locale.LanguageRange.MIN_WEIGHT;

public class Animal {
    final public String species;
    public Boolean isAlive = true;
    String name;
    Double weight = 10.0;
    File pic;

    public Animal(String species) {
        this.species = species;
    }

    void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
        } else {
            System.out.println("too late");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
            }
        }
    }
}
