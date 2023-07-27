package org.example.héritage;

// Utiliusation de mot clé extends pour hériter d'une classe
public class Chat extends Animal{
    private int life;

    // Appel du constructeur parent
    public Chat(String name, int age, String color) {
        // Utilisation du mot clé super pour appeler le constructeur du parent avec ses paramétres
        super(name, age, color);
        this.life = 7;
    }

    public int getLife() {
        return life;
    }

    // Surcharge de la méthode parent
    // utilisation de l'annotation @Override
    @Override
    public void  shoot(){
        System.out.println("Miaou Miou");
    }

    // Surcharge de la méthode parent
    // utilisation de l'ancien comportement avec super.<nom méthode>(<paramétres>)
    @Override
    public void toEat(){
        super.toEat();
        System.out.println("Je mange de délicieuses croquettes");
    }

    @Override
    public String toString() {
        return "Nom du chat : "+getName()+" age : "+getAge()+" année de naissance : "+dateOfBirthday();
    }
}
