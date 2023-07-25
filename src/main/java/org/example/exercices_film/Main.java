package org.example.exercices_film;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("La Haine","Mathieu Kassovitz", LocalDate.of(1995,05,31) ,"Drame");
        Movie movie2 = new Movie("Avatar 2","James Cameron",LocalDate.of(2022,12,14) ,"'Action");

        System.out.println(movie1);
        System.out.println(movie2);
    }
}
