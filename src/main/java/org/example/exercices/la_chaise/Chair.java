package org.example.exercices.la_chaise;

public class Chair {
    /*1. Créer une classe Chaise possédant comme variables d’instance le nombre de pieds, le
        matériaux et la couleur de l’objet
        2. Afficher ses informations en surchargeant une méthode de la classe Object
        3. La classe Chaise pourra être instanciée avec ou sans paramètres (Constructeur par
        défaut)
        4. Afficher toutes les chaises (Possibilité de simplifier avec une méthode ToString)*/

    private int footCount;
    private String materials;
    private String color;
    private double price;

    public Chair(int footCount, String materials, String color,double price) {
        this.footCount = footCount;
        this.materials = materials;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chair :" +
                "Je suis une chaise avec " + footCount +
                " pied(s), en " + materials+
                " de couleur " + color+
                " à un prix de "+ price+" €";
    }
}
