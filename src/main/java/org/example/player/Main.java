package org.example.player;

public class Main {
    public static void main(String[] args) {
        Player player1 =new Player("Botas",6,95);
        Player player2 =new Player("WarriorDu59",0,0);
        Player player3 =new Player("Evers",15,99);
        System.out.println("#########JOUEUR 1##########");
        player1.completeAQuest();
        System.out.println(player1);
        System.out.println("#########JOUEUR 2##########");
        player2.completeAQuest();
        player2.postQuest();
        player2.setName("LeGigaBossDuJava");
        System.out.println("#########JOUEUR 3##########");
        player3.completeAQuest();
        System.out.println(player3);
    }
}
