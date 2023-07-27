package org.example.static_;

public class Maison {
    private  String color;
    private  int nbDoor;
    private double width;
    private  double height;
    // Attributs de classe : commun à toute les instances
    // <visibilité> static <type> <nom>
    // si il est en public <Classe>.<attribut>
    private static int nbHouse;
    public  static String latinName = "Domus";

    public Maison(String color, int nbDoor, double width, double height) {
        nbHouse++;
        this.color = color;
        this.nbDoor = nbDoor;
        this.width = width;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNbDoor() {
        return nbDoor;
    }

    public void setNbDoor(int nbDoor) {
        this.nbDoor = nbDoor;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // <vsibilité> static <type de retour> <nom>(<paramétres)
    public static int getNbHouse() {
        return nbHouse;
    }

}
