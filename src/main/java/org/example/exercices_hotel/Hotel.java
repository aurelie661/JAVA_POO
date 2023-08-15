package org.example.exercices_hotel;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Customer> customers;
    private List<Room> rooms;
    private List<Reservation> reservations;
    private String name;

    public Hotel(List<Customer> customers, List<Room> rooms, List<Reservation> reservations, String name) {
        this.customers = customers;
        this.rooms = rooms;
        this.reservations = reservations;
        this.name = name;
    }

    public Hotel(){}
    public List<Customer> getCustomers() {
        for (Customer customer : customers) {
            System.out.println("\t"+customer);
        }
        return customers;
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

    public void showReservationsOfCustomer(int idCustomer){
            if(!reservations.isEmpty()){
                for (Reservation reservation: reservations) {
                    if (reservation.getCustomer().getId() == idCustomer) {
                        System.out.println(reservation);
                    }
                }
            }else{
                System.out.println("\tAucune réservation pour ce client actuellement.");
            }

        }

    public  void addReservation(Room room, Customer customer){
        List<Room> roomReserved = new ArrayList<>();
        roomReserved.add(room);
        reservations.add(new Reservation(roomReserved,customer));
        room.changeStatus();
        System.out.println("La chambre a été réservée avec succès.");
    }

    public void  removeReservation(int idCustomer,int idRoom){
        Reservation reservationToRemove = null;
        Customer customerFound;
        for (Customer customer: customers) {
            if(customer.getId() == idCustomer){
                customerFound = customer;
                for (Reservation reservation : reservations) {
                    if (customerFound.getId() == idCustomer && reservation.getId() == idRoom) {
                        reservationToRemove = reservation;
                        break;
                    }
                }
            }
        }//todo à finir (Mauvaise suppression) + changeStatut

        if (reservationToRemove != null) {
            reservations.remove(reservationToRemove);
            System.out.println("La réservation a été annulée avec succès.");
        } else {
            System.out.println("Aucune réservation correspondante trouvée.");
        }
    }
}
