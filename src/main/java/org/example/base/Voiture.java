package org.example.base;

public class Voiture {

    //<visibilité> <type> <nom>
    // public : accessible en dehors de la classe
    public String couleur;
    public  int carburant;
    public int puissance;

    // private: accessible uniquement dans la classe
    private  String marque;

    // protected : accessible dans la classe et dans les enfants qui héritent de cette classe
    protected  int nombrePortes;

    //Constructor
    //Défini comment est construit la classe
    public  Voiture(){
        System.out.println("Je suis dans le constructeur sans paramètre.");
    }

    //Polymorphisme : possibilité de définir plusieurs méthode avec le même nom mais des signatures différentes
    public Voiture(String couleur){
        this(); //this(<paramètre>) appelle le constructeur avec la signature similaire
        System.out.println("Je suis dans le constructeur avec paramètre couleur!");
        this.couleur = couleur;
    }

    public Voiture(String couleur, int carburant, int puissance){
        this(couleur);
        this.carburant = carburant;
        this.puissance = puissance;
        System.out.println("Je suis dans le constructeur avec les paramètres couleur,carburant,puissance!");

    }

    //Méthodes d'instance

    //<visibilité> <type de retour> <nom>(params)
    public  void  demarrer(){
        System.out.println("La voiture démarre!");
    }

    public  void  freiner(){
        System.out.println("La voiture freine!");
    }

    public  void  remplirReservoir(int volume){
        carburant+=volume;
    }

    public double puissanceChevauxFiscaux(){
        return puissance/7.;
    }

    @Override
    public String toString() {
        return "Voiture :" +
                "couleur='" + couleur + '\'' +
                ", carburant=" + carburant +
                ", puissance=" + puissance +
                ", marque='" + marque + '\'' +
                ", nombrePortes=" + nombrePortes +
                '.';
    }

    //Destructeur
    protected  void finalize(){

    }
}
