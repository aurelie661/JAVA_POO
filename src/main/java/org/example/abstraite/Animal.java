package org.example.abstraite;

// Une classe abstraite se déclare avec le mot clé abstract
public abstract class Animal {
    protected String name;
    protected int age;
    protected String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // On peut définir des signature de méthodes en abstract
    // Les méthodes devront etre surchargées dans les classes enfants
    public abstract void shoot();

    public void toEat(){
        System.out.println("miam miam je mange");
    }
}
