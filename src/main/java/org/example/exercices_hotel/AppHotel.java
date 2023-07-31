package org.example.exercices_hotel;
import java.util.*;

public class AppHotel {
    //Method to generate the full name of customers
    public  static String PrintRandomFullName(){
        String[] firstName = {"Guillaume","hypolite","Aurélie","Océane",
                              "Asma","Ikhlasse","Sophie","Saliha","Dorian",
                              "Muézi","Elisa","Arthur","Julien","Omar","Thomas"};
        String[] lastName = {"Dupond","Dupuis","Durand","Ducon",
                            "Leroux","Lerois","Levillier","Lavoix","Vilout",
                            "Zénani","Zémour","Englos","Martin","Martinache","Petit"};
        Random random = new Random();
        return firstName[random.nextInt(firstName.length)]+" "+lastName[random.nextInt(lastName.length)];
    }

    //Method to generate customer phone number
    public  static  String PrintRandomPhoneNumber(){
        String[] number1 = {"060708","040805","038754","017812"};
        String[] number2 = {"5487","3548","2164","5453"};
        Random random = new Random();
        return number1[random.nextInt(number1.length)]+number2[random.nextInt(number2.length)];
    }
    public static void main(String[] args) {
        int choice;
        int numberOfRoom;
        int customerId;
        String customerFullName;
        String customerPhoneNumber;

        //Instantiation of customers, rooms, reservations and the hotel
        List<Customer> customers = new ArrayList<>();
        List<Room> rooms = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();
        List<Room> reservedRoom = new ArrayList<>();
        Hotel hotel = new Hotel(customers,rooms,reservations);

        //Generates a random number for creating guests and rooms
        double doubleRandomNb = Math.random() * 15;
        int randomNb = (int) doubleRandomNb;

        //Creation of customers
        for (int i = 0; i < randomNb; i++) {
            customers.add(new Customer(i+1,PrintRandomFullName(),PrintRandomPhoneNumber()));
            System.out.println();
        }
        //Creation of rooms
        for (int i = 0; i < randomNb; i++) {
            rooms.add(new Room(i+1, (int) (Math.random() * 7),randomNb * 19));
            System.out.println();
        }

        //Show a menu
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("\t\tBienvenue à %s\n", hotel.getName().toString());
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


            switch (choice){
                case 1:
                    System.out.println("\t====== Ajouter un client ======");
                    System.out.println("Nom complet :");
                    customerFullName =scanner.nextLine();
                    System.out.println("Numéro de téléphone :");
                    customerPhoneNumber = scanner.nextLine();
                    hotel.addCustomer(customers.size() + 1,customerFullName,customerPhoneNumber);
                    System.out.println("\n\n\n");
                    break;
                case 2:
                    System.out.println("\t====== Liste des Clients ======");
                    hotel.getCustomers();
                    System.out.println("\n\n\n");
                    break;
                case 3:
                    System.out.println("\t====== Afficher les réservations d'un client ======");

                    break;
                case 4:
                    System.out.println("\t====== Ajouter une réservation ======");
                    System.out.println("Identifiant client :");
                    customerId =scanner.nextInt();
                    System.out.println("Numéro de Chambre :");
                    numberOfRoom = scanner.nextInt();
                    reservedRoom.add(rooms.get(numberOfRoom - 1));
                    hotel.addReservation(reservations.size() + 1, reservedRoom, customers.get(customerId - 1));
                    System.out.println("\n\n\n");// todo changeStatus
                    break;
                case 5:
                    System.out.println("\t====== Annuler une réservation ======");
                    System.out.println("Numéro de Chambre :");
                    numberOfRoom = scanner.nextInt();
                    hotel.removeReservation(numberOfRoom - 1);
                    break;
                case 6:
                    System.out.println("\t====== Liste des Réservations ======");
                    hotel.getReservations();
                    System.out.println("\n\n\n");
                    break;
                default:
                    System.out.println("Saisie invalible !");
                    break;
            }

        }while (choice != 0);

    }
}
