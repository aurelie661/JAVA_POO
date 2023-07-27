package org.example.generic;

import org.example.héritage.Chat;

public class Main {
    public static void main(String[] args) {
        //Boite pour une chaîne de caractère
        Boite<String> box = new Boite<>("Contenu de la boite");
        String stringContent = box.getContent();
        System.out.println("Contenu de la boite String : "+stringContent);

        //Boite pour Chat
        Boite<Chat> catBox = new Boite<>(new Chat("Félix",25,"Gris"));
        Chat catContent = catBox.getContent();
        System.out.println("Contenu de la boite Chat : "+catContent);

        //Boite pour un Double
        Boite<Double> doubleBox = new Boite<>(12.36);
        Double doubleContent = doubleBox.getContent();
        System.out.println("Contenu de la boite Double : "+doubleContent);
    }
}
