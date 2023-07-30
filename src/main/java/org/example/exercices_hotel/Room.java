package org.example.exercices_hotel;

public class Room {
    private  int roomNumber;
    private boolean isFree;
    private int numberOfBed;
    private double price;

    public Room(int roomNumber, int numberOfBed, double price) {
        this.roomNumber = roomNumber;
        this.isFree = false;
        this.numberOfBed = numberOfBed;
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

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room :" +
                "room Number= " + roomNumber +
                ", is Free= " + isFree +
                ", number Of Bed= " + numberOfBed +
                ", price= " + price +
                "€\n";
    }

    //todo ajouter la méthode "changeStatus" de isFree
}
