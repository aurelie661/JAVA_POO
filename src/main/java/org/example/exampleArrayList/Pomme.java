package org.example.exampleArrayList;

public class Pomme extends Fruit{

    private int quantity;

    public Pomme(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("une Pomme");
    }
}
