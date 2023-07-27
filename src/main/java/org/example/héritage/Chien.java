package org.example.héritage;

public class Chien extends Animal{
    private double waist;
    public Chien(String name, int age, String color, double waist) {
        super(name, age, color);
        this.waist = waist;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    @Override
    public void shoot(){
        System.out.println("Wouf wouf");
    }

    public void toEat(){
        super.toEat();
        System.out.println("Je mange de la bonne paté pour chien");
    }
}
