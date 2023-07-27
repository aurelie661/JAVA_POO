package org.example.exercices_plante;

public class Plante {
    private String name;
    private double height;
    private String color;

    public Plante(String name, double height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        System.out.print("Plante de nom : "+this.name+" de hauteur : "
                               +this.height+" et de couleur de feuilles : "
                                +this.color);
    }
}
