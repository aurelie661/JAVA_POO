package org.example.exercices_hotel;

import java.util.List;

public class Hotel {
    private List<Customer> customers;
    private List<Room> rooms;
    private List<Reservation> reservations;
    private String name;


    public Hotel(List<Customer> customers, List<Room> rooms, List<Reservation> reservations) {
        this.customers = customers;
        this.rooms = rooms;
        this.reservations = reservations;
        this.name = "Hotel California";
    }

    public List<Customer> getCustomers() {
        for (Customer customer : customers) {
            System.out.println("\t"+customer.toString());
        }
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Reservation> getReservations() {
        for (Reservation reservation : reservations) {
                System.out.println("\t"+reservation.toString());
        }
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

    public void addCustomer(int id, String fullName, String phoneNumber){
         customers.add(new Customer(id,fullName,phoneNumber));
        System.out.println("Client ajouté avec succès.");
    }

    public  void addReservation(int id,List<Room> rooms, Customer customer){
        reservations.add(new Reservation(id,rooms,customer));
        System.out.println("La chambre a été révervée avec succès.");
    }
}
