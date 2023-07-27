package org.example.abstraite;

public class Chien extends Animal{
    public Chien(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void shoot() {
        System.out.println("Wouf Wouf");
    }
}
