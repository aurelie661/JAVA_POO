package org.example.exercices_hotel;
import java.util.List;

public class Reservation {
    private final int id;
    private boolean isConfirmed;
    private List<Room> rooms;
    private Customer customer;
    private static int countCustomer = 1;

    public Reservation(List<Room> rooms, Customer customer) {
        this.id = countCustomer++;
        this.isConfirmed = false;
        this.rooms = rooms;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }
    public Customer getCustomer() {
        return customer;
    }
    @Override
    public String toString() {
        return rooms + "\t a été réservé par "+customer.show()+"\n";
    }
    public void changeStatus(){
        if(!isConfirmed){
            setConfirmed(false);
        }else{
            setConfirmed(true);
        }
    }
}
