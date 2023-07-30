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
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

}
