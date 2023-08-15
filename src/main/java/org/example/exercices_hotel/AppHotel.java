package org.example.exercices_hotel;
import java.util.*;

public class AppHotel {
    //Method to generate the first name of customers
    public  static String PrintRandomFirstName(){
        String[] firstName = {"Guillaume","hypolite","Aurélie","Océane",
                              "Asma","Ikhlasse","Sophie","Saliha","Dorian",
                              "Muézi","Elisa","Arthur","Julien","Omar","Thomas"};

        Random random = new Random();
        return firstName[random.nextInt(firstName.length)];
    }
    //Method to generate the last name of customers
    public static String PrintRandomLastName(){
        String[] lastName = {"Dupond","Dupuis","Durand","Ducon",
                "Leroux","Lerois","Levillier","Lavoix","Vilout",
                "Zénani","Zémour","Englos","Martin","Martinache","Petit"};

        Random random = new Random();
        return lastName[random.nextInt(lastName.length)];
    }
    //Method to generate customer phone number
    public  static  String PrintRandomPhoneNumber(){
        String[] number1 = {"060708","040805","038754","017812"};
        String[] number2 = {"5487","3548","2164","5453"};
        Random random = new Random();
        return number1[random.nextInt(number1.length)]+number2[random.nextInt(number2.length)];
    }
}
