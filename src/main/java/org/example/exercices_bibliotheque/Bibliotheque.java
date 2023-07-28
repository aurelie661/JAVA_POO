package org.example.exercices_bibliotheque;
import java.util.ArrayList;
import java.util.Iterator;

public class Bibliotheque {

        private ArrayList<Livre> livres;


        public Bibliotheque() {
            livres = new ArrayList<>();
        }


        public void addLivre(Livre livre){
            livres.add(livre);
        }

        public void removeLivre(Livre livre){
            livres.remove(livre);
        }

        public void afficheAll(){
            for (Livre l : livres){
                System.out.println(l.toString());
            }
        }

        public void empruntLivre(Livre livre){
            // if(livre.isEstEmprunte() == false){
            if(!livre.isBorrow()){
                livre.changeStatus();
            }
        }

        public void rendreLivre(Livre livre){
            if(livre.isBorrow()){
                livre.changeStatus();
            }
        }

        public String borrowBookByTitle(String title){
            for (int i = 0; i < livres.size() ; i++) {
                if(livres.get(i).getTitle().equals(title)){
                    livres.get(i).changeStatus();
                    return "Vous venez d'emprunter le livre : "+ livres.get(i).getTitle();
                }
            }
            return title+" n'est pas présent actuellement.";
        }

        public String removeBookByTitle(String title){
            for (int i = 0; i < livres.size(); i++) {
                if(livres.get(i).getTitle().equals(title)){
                    livres.remove(i);
                    return "Vous venez de supprimer le livre : "+ livres.get(i).getTitle();
                }
            }
            return null;
        }

        public Iterator<Livre> iterator() {
            return livres.iterator();
        }
}





