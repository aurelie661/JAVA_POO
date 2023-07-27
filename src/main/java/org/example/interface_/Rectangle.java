package org.example.interface_;

public class Rectangle extends Forme{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void showDetails() {
        System.out.println("Rectangle : "+name);
        System.out.println("Longueur : "+length);
        System.out.println("Largeur : "+width);
        System.out.println("Aire : "+ calculateArea());
        System.out.println("Périmetre : "+calculatePerimeter());
    }
}
