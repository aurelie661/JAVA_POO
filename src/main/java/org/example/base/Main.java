package org.example.base;

public class Main {
    public static void main(String[] args) {
        // Instanciation d'un objet voiture
        System.out.println("######Voiture1########");
        Voiture voiture1 = new Voiture();

        //Pour executer une méthode d'instance, il suffit de faire objet.methode(<params>)
        voiture1.demarrer();

        //Pour accéder à un attribut public, il suffit de faire objet.attribut
        voiture1.puissance = 12;
        voiture1.couleur = "Rouge";
        voiture1.carburant = 0;
        voiture1.nombrePortes = 5;

        voiture1.remplirReservoir(40);
        voiture1.carburant += 1;
        System.out.println(voiture1.carburant);

        System.out.println("######Voiture2########");
        Voiture voiture2 = new Voiture("Vert",32,125);
        double chevauxFiscaux = voiture2.puissanceChevauxFiscaux();
        System.out.println(chevauxFiscaux);
        System.out.println(voiture2.toString());
        System.out.println(voiture2);

        System.out.println("######Voiture3########");
        Voiture voiture3 = new Voiture("Bleu");


    }
}
