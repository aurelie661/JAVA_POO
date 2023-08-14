package org.example.exercices_hotel;

import java.util.List;

public class Reservation {

    private final int id;
    private boolean isConfirmed;
    private List<Room> rooms;
    private Customer customer;

    public Reservation(int id, List<Room> rooms, Customer customer) {
        this.id = id;
        this.isConfirmed = false;
        this.rooms = rooms;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return rooms + " a été réservé par "+customer.affiche();
    }

    public void changeStatus(){
        if(!isConfirmed){
            setConfirmed(false);
        }else{
            setConfirmed(true);
        }
    }
}
