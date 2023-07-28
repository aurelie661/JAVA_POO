package org.example.collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

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

        sortedSet.add("C#");
        sortedSet.add("Python");
        sortedSet.add("JAVA");
        sortedSet.add("JAVA"); // non ajouter car doublons
        sortedSet.add("JAvA");
        sortedSet.add("JaVA");
        System.out.println("SortedSet : "+ sortedSet);//Ajouter par ordre alphabetique

        //Méthodes pour sortedSet
        System.out.println("1. premier élèment : "+ sortedSet.first());
        System.out.println("2. dernier élèment : " +sortedSet.last());
        System.out.println("3. Taille du sortedSert : "+ sortedSet.size());
        System.out.println("4. prend les élèments avant le head : " +sortedSet.headSet("JAvA"));

        // Démo pour linkedList
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(12.63);
        linkedList.add(15.25);
        linkedList.add(12.63);
        linkedList.add(19.99);
        System.out.println("LinkedList : "+ linkedList);

        //Méthodes pour linkedList
        System.out.println("1. premier élèment : "+ linkedList.getFirst());
        System.out.println("2. dernier élèment : " +linkedList.getLast());
        System.out.println("3. Taille du linkedList : "+ linkedList.size());
        linkedList.removeFirst();
        System.out.println("LinkedList : "+ linkedList);
        linkedList.removeLast();
        System.out.println("LinkedList : "+ linkedList);


        //Démo pour le SortedMap
        SortedMap<String,Integer> sortedMap =new TreeMap<>();
        sortedMap.put("JAVA",20);
        sortedMap.put("PYTHON",10);
        sortedMap.put("C#",15);
        sortedMap.put("KOTLIN",18);

        System.out.println("SortedMap "+ sortedMap);

        //Méthodes pour le SortedMap
        System.out.println("1. récupérer toutes les Key "+ sortedMap.keySet());
        System.out.println("1. récupérer les valeurs "+ sortedMap.values());
        System.out.println("1. récupérer la 1er Key "+ sortedMap.firstKey());
        System.out.println("1. récupérer la dernière Key "+ sortedMap.lastKey());
        sortedMap.remove("Java");
        System.out.println(" SortedMap : " +sortedMap);

        // Démo pour HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java",20);
        hashMap.put("Python",10);
        hashMap.put("C++",30);
        System.out.println(" hashMap : "+hashMap);

        // Méthodes pour le HashMap
        System.out.println("1. Taille du HasMap : " +hashMap.size());
        System.out.println("2. Valeur associé a la clé 'Java' : " +hashMap.get("Java"));
        System.out.println("3. Verification si clé 'Banana' presente  : " +hashMap.containsKey("Banana"));
        hashMap.remove("Python");
        System.out.println("4. Suppression de l'entrée avec la clé Python");
        System.out.println(" hasMap : "+hashMap);
    }
}
