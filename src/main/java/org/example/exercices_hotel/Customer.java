package org.example.exercices_hotel;

public class Customer {
    private final int id;
    private String fullName;
    private String phoneNumber;

    public Customer(int id, String fullName, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
            return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "id = " + id +
                ", Name = " + fullName +
                ", Phone Number = " + phoneNumber +
                "\n";
    }


}
