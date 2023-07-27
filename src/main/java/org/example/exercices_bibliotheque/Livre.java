package org.example.exercices_bibliotheque;

public class Livre {
    private String title;
    private String author;
    private int nbPage;
    private boolean isBorrow = false;

    public Livre(String title, String author, int nbPage) {
        this.title = title;
        this.author = author;
        this.nbPage = nbPage;
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

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }

   public void statementOfBorrowing(Livre livre){
        if(livre.isBorrow == true){
            livre.setBorrow(false);
        }else {
            livre.setBorrow(true);
        }
   }
    public void borrowBook(Livre livre){
        if(!livre.isBorrow){
            livre.setBorrow(true);
            System.out.printf("Le livre %s à été emprunté.",livre.getTitle());
        }
    }

    public void returnBook(Livre livre){
        if(livre.isBorrow){
            livre.setBorrow(false);
            System.out.printf("Le livre %s est disponible.",livre.getTitle());
        }
    }
    public String showDetails() {
        return "Livre :" +
                "title= '" + title + '\'' +
                ", autor= '" + author + '\'' +
                ", nbPage= " + nbPage +
                ", isBorrow= " + isBorrow +
                '.';
    }
}
