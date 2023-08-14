package org.example.exercices_hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Customer> customers;
    private List<Room> rooms;
    private List<Reservation> reservations;
    private String name;

    public Hotel(String name) {
        this.name = name;
    }

    public Hotel(List<Customer> customers, List<Room> rooms, List<Reservation> reservations) {
        this.customers = customers;
        this.rooms = rooms;
        this.reservations = reservations;
    }

    public List<Customer> getCustomers() {
        for (Customer customer : customers) {
            System.out.println("\t"+customer);
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
        if(!reservations.isEmpty()){
            for (Reservation reservation : reservations) {
                System.out.println("\t"+reservation);
            }
            return reservations;
        }else{
            System.out.println("\tAucune réservation actuellement!");
            return null;
        }
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

    public void addCustomer(String firstName, String LastName, String phoneNumber){
            customers.add(new Customer(firstName,LastName,phoneNumber));
            System.out.println("Le client a été ajouté avec succès.");
    }

    public  void addReservation(int id,Room room, Customer customer){
        List<Room> roomReserved = new ArrayList<>();
        roomReserved.add(room);
        reservations.add(new Reservation(id,roomReserved,customer));
        room.changeStatus();

        System.out.println("La chambre a été réservée avec succès.");
    }

    public void  removeReservation(int id){
        for (int i = 0; i < reservations.size(); i++) {
            Reservation reservation = reservations.get(id);
            reservations.remove(reservation);// todo changeStatus
            System.out.println("La réservation a été annulée avec succès.");
        }
    }
}
