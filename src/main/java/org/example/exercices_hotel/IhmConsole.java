package org.example.exercices_hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.example.exercices_hotel.AppHotel.*;

public class IhmConsole {
    private static final Scanner scanner = new Scanner(System.in);
    private static Hotel hotel = new Hotel();
    private static List<Customer> customers = new ArrayList<>();
    private static List<Room> rooms = new ArrayList<>();
    private static List<Reservation> reservations = new ArrayList<>();

    public static void StartIhm(){
        System.out.println("Quel est le nom de votre hotel :");
        String hotelName = scanner.nextLine();
        GenerateData();
        hotel = new Hotel(customers,rooms,reservations,hotelName);
        System.out.println("\t\t\nHotel "+hotel.getName()+ " crée avec succés !\n");
        System.out.println(rooms);
        ShowMenu();
    }
    public static void GenerateData(){
        PrintRandomFirstName();
        PrintRandomLastName();
        PrintRandomPhoneNumber();
        double doubleRandomNb = Math.random() * 15 + 1;
        int randomNb = (int) doubleRandomNb;
        //Creation of customers
        for (int i = 0; i < randomNb; i++) {
            customers.add(new Customer(PrintRandomFirstName(),PrintRandomLastName(),PrintRandomPhoneNumber()));
            System.out.println();
        }
        //Creation of rooms
        for (int i = 0; i < randomNb; i++) {
            rooms.add(new Room((int) (Math.random() * 10) ,randomNb * 19));
            System.out.println();
        }
    }
    public static void ShowMenu(){
        int choice;
        do {
            System.out.printf("\t\tBienvenue à l'hotel %s\n", hotel.getName());
            System.out.println("================ Menu Principal ================");
            System.out.println("\t\t1. Ajouter un client");
            System.out.println("\t\t2. Afficher la liste des clients");
            System.out.println("\t\t3. Afficher les réservations d'un client");
            System.out.println("\t\t4. Ajouter une réservation");
            System.out.println("\t\t5. Annuler une réservation");
            System.out.println("\t\t6. Afficher la liste des réservations");
            System.out.println("\t\t0. Quitter");
            System.out.print("\t\tVotre choix : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch(choice){
                case 1 -> AddCustomer();
                case 2 -> ShowCustomers();
                case 3 -> ShowReservationsOfCustomer();
                case 4 -> AddReservation();
                case 5 -> DeleteReservation();
                case 6 -> ShowAllReservations();
                case 0 -> System.out.println("Merci, Aurevoir!");
                default -> System.out.println("Saisie invalible ! ( Saisir un chiffre entre 1 et 6 )");
            }
        }while (choice != 0);
    }
    public static void AddCustomer(){
        System.out.println("\t====== Ajouter un client ======");
        System.out.println("\n");
        System.out.println("Prénom :");
        String customerFirstName =scanner.nextLine();
        System.out.println("Nom :");
        String customerLastName =scanner.nextLine();
        System.out.println("Numéro de téléphone :");
        String customerPhoneNumber = scanner.nextLine();
        hotel.addCustomer(customerFirstName,customerLastName,customerPhoneNumber);
        System.out.println("\n\n");
    }
    public static void ShowCustomers(){
        System.out.println("\t====== Liste des Clients ======");
        System.out.println("\n");
        hotel.getCustomers();
        System.out.println("\n\n");
    }
    public static void ShowReservationsOfCustomer(){
        System.out.println("\t====== Afficher les réservations d'un client ======");
        System.out.println("\n");
        System.out.println("Identifiant client :");
        int customerId = scanner.nextInt();
        hotel.showReservationsOfCustomer(customerId);
        System.out.println("\n\n");
    }
    public static void AddReservation(){
        System.out.println("\t====== Ajouter une réservation ======");
        System.out.println("\n");
        System.out.println("Identifiant client :");
        int customerId =scanner.nextInt();
        System.out.println("Numéro de Chambre :");
        int numberOfRoom = scanner.nextInt();
        hotel.addReservation(rooms.get(numberOfRoom - 1), customers.get(customerId - 1));
        System.out.println("\n\n");
    }
    public static void DeleteReservation(){
        System.out.println("\t====== Annuler une réservation ======");
        System.out.println("\n");
        System.out.println("Identifiant client :");
        int customerId =scanner.nextInt();
        System.out.println("Numéro de Chambre :");
        int numberOfRoom = scanner.nextInt();
        hotel.removeReservation(customerId - 1,numberOfRoom - 1);
        System.out.println("\n\n");//todo à finir (mauvaise suppression)
    }
    public static void ShowAllReservations(){
        System.out.println("\t====== Liste des Réservations ======");
        System.out.println("\n");
        hotel.getReservations();
        System.out.println("\n\n");
    }
}
