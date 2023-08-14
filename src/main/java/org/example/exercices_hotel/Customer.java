package org.example.exercices_hotel;

public class Customer {
    private final int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    private static int countCustomer = 0;

    public Customer(String firstName, String lastName, String phoneNumber) {
        this.id = countCustomer++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return id +") "+
                ", Name = " + firstName +" "+lastName+
                ", Phone Number = " + phoneNumber +
                "\n";
    }

    public String affiche(){
        return id+" => "+firstName +" "+lastName;
    }
}
