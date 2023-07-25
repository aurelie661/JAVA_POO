package org.example.exercices.la_chaise;

public class Main {
    public static void main(String[] args) {
        Chair chair1 = new Chair(4,"chaine","Beige",156.99);
        Chair chair2 = new Chair(3,"bambou","bleu",230.59);
        Chair chair3 = new Chair(2,"métal","rouge",13258.25);
        Chair chair4 = new Chair(1,"alluminium","noir",1.99);

        System.out.println(chair1);
        System.out.println(chair2);
        System.out.println(chair3);
        System.out.println(chair4);
    }
}
