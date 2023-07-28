package org.example.exception;

import java.util.Scanner;

public class MainCompte {
    public static void main(String[] args) throws Exception {
        Compte cp=new Compte();
        Scanner clavier=new Scanner(System.in);
        System.out.print("Montant à verser:");
        float mt1=clavier.nextFloat(); cp.verser(mt1);
        System.out.println("Solde Actuel:"+cp.getSolde());
        System.out.print("Montant à retirer:");
        float mt2=clavier.nextFloat();
        /*cp.retirer(mt2); Le compilateur signal l'exeption*/

        /*Solution ci- dessous*/
        try {
            cp.retirer(mt2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Solde Final:"+cp.getSolde());
    }
}
