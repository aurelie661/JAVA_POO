package org.example.exercices_film;

import java.time.LocalDate;

public class Movie {
    /*1. Créer une classe "Film"
      2. Ajouter les attributs suivants : titre, réalisateur, année de sortie et genre
      3. Ajouter un constructeur, des getters et des setters pour ces attributs, ainsi
        qu'une méthode pour afficher les informations sur le film*/

    private String title;
    private String director;
    private LocalDate yearOfRelease;
    private String gender;

    public Movie(String title, String director, LocalDate yearOfRelease, String gender) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(LocalDate yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "title= ' " + title + '\'' +
                ", director= ' " + director + '\'' +
                ", yearOfRelease= " + yearOfRelease +
                ", gender= ' " + gender + '\'' +
                '}';
    }
}
