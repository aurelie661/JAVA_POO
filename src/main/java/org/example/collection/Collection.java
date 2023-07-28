package org.example.collection;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Collection {
    public static void main(String[] args) {
        //Démo pour vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Strawberry");
        System.out.println("Vector : "+ vector);// méthode toString incluse

        //Méthodes pour Vector
        System.out.println("1. taille du Vector : " +vector.size());
        System.out.println("2. élèment à l'index 0 : " +vector.get(0));
        System.out.println("3. l'élèment est connu  : " +vector.contains("Banana"));
        System.out.println("4. élèment à l'index 1  : " +vector.elementAt(1));


        vector.add(1,"Toto");
        System.out.println("Vector : "+ vector);

        // Démo pour sortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("JAVA");
        sortedSet.add("JAVA"); // non ajouter car doublon
        sortedSet.add("JAvA");
        sortedSet.add("JaVA");
        System.out.println("SortedSet : "+ sortedSet);
    }
}
