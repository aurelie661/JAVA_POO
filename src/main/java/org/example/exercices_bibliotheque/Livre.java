package org.example.exercices_bibliotheque;

public class Livre {
    private String title;
    private String author;
    private int nbPage;
    private boolean isBorrow;

    public Livre(String title, String author, int nbPage) {
        this.title = title;
        this.author = author;
        this.nbPage = nbPage;
        this.isBorrow = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setIsBorrow(boolean isBorrow) {
        this.isBorrow = isBorrow;
    }

    @Override
    public String toString() {
        return "Livre : " +
                "titre = '" + title + '\'' +
                ", auteur = '" + author + '\'' +
                ", nbPages = " + nbPage +
                ", estEmprunte = " + isBorrow +
                '.';
    }

    public void changeStatus(){
        this.isBorrow = !this.isBorrow;
    }
}
