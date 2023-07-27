package org.example.abstraite;

public class Main {
    public static void main(String[] args) {
        //   Animal animal = new Animal(); // Imposssible d'instancier une classe abstraite
        Chat chat = new Chat("félix",3,"noir et blanc");
        chat.shoot();
        chat.toEat();

        Chien chien = new Chien("Bill",10,"Roux");
        chien.shoot();
        chien.toEat();
    }
}
