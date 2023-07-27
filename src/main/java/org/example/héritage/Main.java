package org.example.héritage;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("toto",10,"Bleue");
        animal.toEat();

        // System.out.println(animal.anneeNaissance()); // méthode protected

        Chat chat = new Chat("Garfield",5,"Roux");
        chat.shoot();

        Chien chien = new Chien("Rex",10, "Roux et bleue",1.20);
        chien.shoot();

        chat.toEat();

        chien.toEat();

        System.out.println(animal);
        System.out.println(chien);
        System.out.println(chat);
        System.out.println();

        // Objet est l'objet racine dont toutes les classes héritent
        Object object = new Object();
    }
}
