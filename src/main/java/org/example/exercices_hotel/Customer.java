package org.example.exercices_hotel;

public class Customer {
    private final int id;
    private String lastName;
    private String firstName;
    private String phoneNumber;

    public Customer(int id, String lastName, String firstName, String phoneNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer :" +
                "id= " + id +
                ", lastName= '" + lastName + '\'' +
                ", firstName= '" + firstName + '\'' +
                ", phoneNumber= '" + phoneNumber + '\'' +
                '.';
    }
}
