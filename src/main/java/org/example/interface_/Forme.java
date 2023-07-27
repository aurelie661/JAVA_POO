package org.example.interface_;

public abstract class Forme implements Calculable{
    protected String name;

    public Forme(String name) {
        this.name = name;
    }

    public abstract void showDetails();

    @Override
    public double calculateArea() {
        return 0.0;
    }

    public  static  String compareArea(Forme forme1, Forme forme2){
        double aire1 = forme1.calculateArea();
        double aire2 = forme2.calculateArea();
        if(aire1 > aire2){
            return forme1.name+" a une plus grande aire que "+forme2.name;
        } else if (aire2 > aire1) {
            return forme2.name+" a une plus grande aire que "+forme1.name;
        }else{
            return "Les deux formes ont la même aire.";
        }
    }
}
