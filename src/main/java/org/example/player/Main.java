package org.example.player;

public class Main {
    public static void main(String[] args) {
        Player player1 =new Player("Botas",6,95);
        Player player2 =new Player("Leclerc",2,68);
        Player player3 =new Player("Evers",15,99);

        player1.completeAQuest();
        System.out.println(player1);

        player3.completeAQuest();
        System.out.println(player3);
    }
}
