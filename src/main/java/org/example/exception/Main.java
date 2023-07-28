package org.example.exception;

import java.util.Scanner;

public class Main {
    public static int calcul(int a,int b){
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.print("Donner a:");int a=clavier.nextInt();
        System.out.print("Donner b:");int b=clavier.nextInt();
        int resultat=0;
        try{
            resultat=calcul(a, b);
        }
        catch (ArithmeticException e) {
            System.out.println("Division par zero impossible!");
            System.out.println();
            System.out.println("retourne le message de l’exception : "+e.getMessage());
            System.out.println();
            System.out.println("retourne une chaine qui contient le type de l’exception \n" +
                            "et le message de l’exception : "+e.toString());
            System.out.println();
            System.out.print(" affiche la trace de l’exception : ");
            e.printStackTrace();
            System.out.println();
        }
        System.out.println("Resultat= "+resultat);

    }
}
