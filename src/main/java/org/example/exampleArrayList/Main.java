package org.example.exampleArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Déclaration d'une liste de type Fruit
        List<Fruit> fruits;
        // Création de la liste
        fruits = new ArrayList<Fruit>();
        // Ajout de 3 objets Pomme,Orange et Pomme à la liste
        fruits.add(new Pomme(30));
        fruits.add(new Orange(25));
        fruits.add(new Pomme(60));
        // Parcourir tous les objets
        for (int i= 0;i<fruits.size();i++){
            //Faire appel à la méthode affiche() de chaque Fruit de la liste
            fruits.get(i).affiche();
        }
        // Une autre maniére plus simple pour parcourir une liste
        for(Fruit f:fruits){ // Pour chaque Fruit de la lste
            f.affiche(); // Faire appel à la méthode affiche() du Fruit f
        }
        Map<String, Fruit> fruitsMap=new HashMap<String, Fruit>();

        System.out.println("###########################################");
        fruitsMap.put("premier", new Pomme(3));

        System.out.println("########1er affichage ###############");
        Fruit f = fruitsMap.get("premier");
        f.affiche();

        System.out.println("############2 eme affichage##############");
        Iterator<String> it=fruitsMap.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            Fruit ff=fruitsMap.get(key);
            System.out.println(key);
            ff.affiche();
        }
    }
}
