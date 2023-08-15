package org.example.exercices_hotel;

public class Room {
    private  int roomNumber;
    private boolean isFree;
    private int numberOfBed;
    private double price;
    private static int countCustomer = 1;

    public Room( int numberOfBed, double price) {
        this.roomNumber = countCustomer++;
        this.isFree = true;
        this.numberOfBed = numberOfBed;
        this.price = price;
    }
    public void setFree(boolean free) {
        isFree = free;
    }
    @Override
    public String toString() {
        return  " Chambre n°"+
                roomNumber+" est actuellement libre => "+
                isFree+" il y a "+
                numberOfBed+" lit(s)"+ " sont prix est de "+
                price+" €\n";
    }
    public void changeStatus(){
        if(!isFree){
            setFree(true);
        }else{
            setFree(false);
        }
    }
}
