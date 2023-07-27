package org.example.interface_;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Cercle 1",5.0);
        Rectangle rectangle = new Rectangle("Rectangle 1",4.0,6.0);

        cercle.showDetails();
        rectangle.showDetails();

        System.out.println("Aire du cercle :" +cercle.calculateArea());
        System.out.println("Aire du rectancle :" +rectangle.calculateArea());

        System.out.println(Forme.compareArea(cercle,rectangle));

        // Utilisation du polymorphisme avec un tableau de formes
        Forme[] formes = {cercle,rectangle};
        System.out.println();
        System.out.println(" Détail du tableau de Formes");
        for (Forme forme: formes) {
            forme.showDetails();
            System.out.println("####################");
        }

        // Utilisation du polymorphisme pour calculer aire totale de mes formes
        double aireTotale = 0.0;
        for (Forme forme: formes) {
            aireTotale += forme.calculateArea();
        }

        System.out.println("Air totale des formes : "+aireTotale);

        System.out.println();
        System.out.println("#################################");
        System.out.println();

        Cercle cercle2 = new Cercle("Cercle 2",8.0);
        Rectangle rectangle2 = new Rectangle("Rectangle 2",8.0,16.0);

        Calculable[] formes2 = {cercle2,rectangle2};

        // Utilisation du polymorphisme pour calculer aire totale de mes formes
        double aireTotale2 = 0.0;
        for (Calculable forme: formes2) {
            aireTotale2 += forme.calculateArea();
        }

        System.out.println("Aire totale des formes 2 : "+ aireTotale2);

        // Utilisation du polymorphisme pour calculer aire totale de mes formes
        for (Calculable forme: formes2) {
            if(forme instanceof Forme){
                // Cast
                ((Forme) forme).showDetails();
                System.out.println("########################");
            }
        }

    }
}
