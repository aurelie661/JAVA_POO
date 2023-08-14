package org.example.exercices_hotel;
import java.util.Scanner;

public class IhmConsole {
    private static final Scanner scanner = new Scanner(System.in);
    private static Hotel hotel;

    public static void startIhm(){
        System.out.println("Quel est le nom de votre hotel :");
        String hotelName = scanner.nextLine();
        hotel = new Hotel(hotelName);
        System.out.println("Hotel "+hotel.getName()+ " crée avec succés !");
        System.out.println();
        showMenu();
    }

    public static void showMenu(){
        int choice;
        do {
            System.out.printf("\t\tBienvenue à l'hotel %s\n", hotel.getName());
            System.out.println("================ Menu Principal ================");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Afficher la liste des clients");
            System.out.println("3. Afficher les réservations d'un client");
            System.out.println("4. Ajouter une réservation");
            System.out.println("5. Annuler une réservation");
            System.out.println("6. Afficher la liste des réservations");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();


            switch(choice){
                case 1:
                    addCustomer();
                    System.out.println("\n\n\n");
                    break;
                case 2:
                    System.out.println("\t====== Liste des Clients ======");
                    showCustomers();
                    System.out.println("\n\n\n");
                    break;
                case 3:
                    System.out.println("\t====== Afficher les réservations d'un client ======");

                    break;
                case 4:
                    System.out.println("\t====== Ajouter une réservation ======");

                    System.out.println("\n\n\n");
                    break;
                case 5:
                    System.out.println("\t====== Annuler une réservation ======");

                    break;
                case 6:
                    System.out.println("\t====== Liste des Réservations ======");

                    System.out.println("\n\n\n");
                    break;
                case 0:
                    System.out.println("Merci, Aurevoir!");
                    break;
                default:
                    System.out.println("Saisie invalible !");
                    break;
            }

        }while (choice != 0);

    }

    public static void addCustomer(){
        System.out.println("\t====== Ajouter un client ======");
        System.out.println("Prénom :");
        String customerFirstName =scanner.nextLine();
        System.out.println("Nom :");
        String customerLastName =scanner.nextLine();
        System.out.println("Numéro de téléphone :");
        String customerPhoneNumber = scanner.nextLine();
        hotel.addCustomer(customerFirstName,customerLastName,customerPhoneNumber);
    }

    public static void showCustomers(){
        hotel.getCustomers();
    }
}
