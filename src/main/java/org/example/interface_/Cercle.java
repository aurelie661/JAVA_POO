package org.example.interface_;

public class Cercle extends Forme{
    private double ray;
    public Cercle(String name, double ray) {
        super(name);
        this.ray = ray;
    }

    @Override
    public double calculateArea() {
        return Math.PI * ray * ray;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * ray;
    }

    @Override
    public void showDetails() {
        System.out.println("Cercle : "+ name);
        System.out.println("Rayon : "+ ray);
        System.out.println("Aire : "+ calculateArea());
        System.out.println("Périmètre : "+ calculatePerimeter());
    }
}
