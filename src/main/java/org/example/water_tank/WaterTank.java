package org.example.water_tank;

public class WaterTank {
    /*1. Créer une classe WaterTank
    2. Ajouter les attributs suivants: poids à vide, capacité maximale, niveau de
    remplissage
    3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne
    4. Créer une méthode vider() qui enlèvera un volume d'eau à la citerne
    5. Créer un attribut de classe qui contiendra la totalité des volumes d'eau de la
    citerne
    6. /!\ le volume d'eau d'une citerne ne peut pas être négatif ou dépasser le
    volume maximum*/

    private double weight;
    private double maximumCapacity;
    private double fillLevel;
    public static double totalCapacity = 0;

    public WaterTank(double weight, double maximumCapacity, double fillLevel) {
        this.weight = weight;
        this.maximumCapacity = maximumCapacity;
        this.fillLevel = fillLevel;
        WaterTank.totalCapacity += fillLevel;
    }

    public double getFillLevel() {
        return fillLevel;
    }

    public void toFill(double volume) {
        if ((volume + this.fillLevel) <= this.maximumCapacity) {
            this.fillLevel += volume;
            WaterTank.totalCapacity += volume;

        } /*else {
            surplus = (volume + this.fillLevel) - this.maximumCapacity;
            this.fillLevel += (volume - surplus);
            WaterTank.totalCapacity += (this.fillLevel - surplus);
        }*/
    }

    public void empty(double volume){
        if(this.fillLevel >= volume){
            this.fillLevel -= volume;
            WaterTank.totalCapacity -= fillLevel;
        }/*else{
            double surplus = this.fillLevel - volume;
            this.fillLevel -= volume - surplus;
            WaterTank.totalCapacity -= fillLevel;
        }*/
    }

    public double totalWeight(){
        return this.weight + this.fillLevel;
    }
}
