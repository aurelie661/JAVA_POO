package org.example.exampleArrayList;

public class Orange extends  Fruit{
    private int quantity;

    public Orange(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("une Orange");
    }
}
