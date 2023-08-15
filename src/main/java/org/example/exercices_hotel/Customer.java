package org.example.exercices_hotel;

public class Customer {
    private final int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    private static int countCustomer = 1;

    public Customer(String firstName, String lastName, String phoneNumber) {
        this.id = countCustomer++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return id +") "+
                " Name = " + firstName +" "+lastName+
                ", Phone Number = " + phoneNumber +
                "\n";
    }
    public String show(){
        return id+" => "+firstName +" "+lastName;
    }
}
