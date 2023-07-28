package org.example.exercices_hotel;

public class Room {
    private  int roomNumber;
    private boolean isFree;
    private int numberOfRooms;
    private double price;

    public Room(int roomNumber, int numberOfRooms, double price) {
        this.roomNumber = roomNumber;
        this.isFree = false;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
