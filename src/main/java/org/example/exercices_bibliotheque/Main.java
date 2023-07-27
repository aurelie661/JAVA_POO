package org.example.exercices_bibliotheque;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        Bibliotheque biblio = new Bibliotheque();
        System.out.println("#####################");
        biblio.afficheAll();
        System.out.println("#####################");

        Livre livre1 = new Livre("Titre 1","Auteur 1",123);
        Livre livre2 = new Livre("Titre 2","Auteur 2",123);
        Livre livre3 = new Livre("Titre 3","Auteur 3",123);
        Livre livre4 = new Livre("Titre 4","Auteur 4",123);
        biblio.addLivre(livre1);
        biblio.addLivre(livre2);
        biblio.addLivre(livre3);
        biblio.addLivre(livre4);
        biblio.addLivre(new Livre("Titre 5","Auteur 5",123));

        biblio.afficheAll();

        System.out.println("##################### Emprunt du livre 4");

        biblio.empruntLivre(livre4);
        biblio.afficheAll();

        System.out.println("##################### Rendre le livre 4");

        biblio.rendreLivre(livre4);
        biblio.afficheAll();

        System.out.println("##################### Suppression du livre 3");

        biblio.removeLivre(livre3);
        biblio.afficheAll();


        System.out.println("##################### Suppression du livre 5");
        String deletedBook5 = "Titre 5";

        Iterator<Livre> iterator = biblio.iterator();

        while (iterator.hasNext()){
            Livre livre = iterator.next();
            if(livre.getTitle().equals(deletedBook5)){
                iterator.remove();
                break;
            }
        }
        biblio.afficheAll();
    }
}
