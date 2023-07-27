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

    public void setIsBorrow(boolean borrow) {
        isBorrow = borrow;
    }

   public void statementOfBorrowing(Livre livre){
        this.isBorrow = !this.isBorrow;
   }
    public void borrowBook(Livre livre){
        if(!livre.isBorrow){
            livre.setIsBorrow(true);
            System.out.printf("Le livre %s à été emprunté.",livre.getTitle());
        }
    }

    public void returnBook(Livre livre){
        if(livre.isBorrow){
            livre.setIsBorrow(false);
            System.out.printf("Le livre %s est disponible.",livre.getTitle());
        }
    }
    public String showDetails() {
        return "Livre :" +
                "title= '" + title + '\'' +
                ", author= '" + author + '\'' +
                ", nbPage= " + nbPage +
                ", isBorrow= " + isBorrow +
                '.';
    }
}
