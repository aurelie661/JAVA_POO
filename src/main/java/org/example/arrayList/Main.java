package org.example.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<type> <nom> = new ArrayList<type>();
        ArrayList<String> prenoms = new ArrayList<String>();

        //la méthode add() permet d'ajouter un élèment à  la liste
        prenoms.add("Sophie");
        prenoms.add("Toto");
        prenoms.add("Dorian");

        // la méthode get() permet d'accéder à un élèment par son indice
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));
        System.out.println(prenoms.size());

        // la méthode set() va permettre de modifier un élèment en précisant son index
        prenoms.set(1,"Aurélie");
        System.out.println(prenoms.get(1));

        //La méthode remove() va permettre de supprimer un élèment en précisant son index
        prenoms.remove(0);
        System.out.println(prenoms.get(0));

        //la méthode size() permet de retourner la taille de la list
        System.out.println(prenoms.size());

        // la boucle foreach permet de parcourir la liste
        for (String prenom: prenoms) {
            System.out.println(prenom);
        }

        //Possibilité de parcourir avec la boucle for
        for (int i = 0; i < prenoms.size(); i++) {
            System.out.println(prenoms.get(i));
        }
    }
}
