package org.example.exercices_plante;

public class Arbre extends Plante{

    private double circonference;
    public Arbre(String name, double height, String color,double circonference) {
        super(name, height, color);
        this.circonference = circonference;
    }

    public double getCrconference() {
        return circonference;
    }

    public void setCrconference(double crconference) {
        this.circonference = crconference;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(" et je suis un arbre de circonférence : "+this.circonference);
    }
}
