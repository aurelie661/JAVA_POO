package org.example.exercices_bibliotheque;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    public static void main(String[] args) {
        List<Livre> livres;
        List<Bibliotheque> bibliotheques;

        livres = new ArrayList<Livre>();
        livres.add(new Livre("Seul sur Mars","Andy Weir",369));
        livres.add(new Livre("Pinocchio","Carlos Lorenzini",369));
        livres.add(new Livre("interstellar","Christopher Nolan",369));
        livres.add(new Livre("Chair de poule","Robert Lawrence Stine",369));

        bibliotheques = new ArrayList<Bibliotheque>();

        for (Livre livre: livres) {
            System.out.println(livre.getTitle());
        }

        livres.remove(1);

        for (Livre livre: livres) {
            System.out.println(livre.getTitle());
        }

        livres.get(0).borrowBook(livres.get(0));
        System.out.println(livres.get(0).isBorrow());
        livres.get(0).returnBook(livres.get(0));
        System.out.println(livres.get(0).isBorrow());


        System.out.println(livres.get(0).showDetails());


    }


}
