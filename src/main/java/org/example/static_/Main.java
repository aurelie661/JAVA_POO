package org.example.static_;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nombre de maisons instanciées : "+ Maison.getNbHouse());

        Maison maison = new Maison("Orange",4,12.5,20);
        System.out.println(maison.getColor());
        maison.setColor("Bleu");
        System.out.println(maison.getColor());
        maison.setColor("Rouge");
        System.out.println(maison.getColor());

        Maison maisonJolie = new Maison("Jaune",1,2,3);

        // System.out.println(Maison.nombreMaisons); // private utilisation du getter
        System.out.println("Nombre de maisons instanciées : "+ Maison.getNbHouse());
        System.out.println(Maison.latinName);

        // Exemple de méthodes statiques
        Math.round(120.3);

        String.format("%s","toto");
    }
}
