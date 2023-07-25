package org.example.player;

public class Player {
    /*1. Créer une classe Joueur
    2. Ajouter les attributs suivants : nom, niveau et points d'expérience
    3. Ajouter un constructeur, des getters et des setters pour ces attributs
    4. Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérience
    au joueur
    5. Créer qu'une méthode qui augmente le niveau du joueur de +1 si son
    expérience dépasse 100 points et réinitialise son expérience
    6. Tester le programme*/

    private String name;
    private int level;
    private int xp;

    public Player(String name, int level, int xp) {
        this.name = name;
        this.level = level;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void completeAQuest(){
        xp+=10;
        this.increasesLevel();
    }

    public void increasesLevel(){
        if(xp > 100){
            this.setLevel(level+=1);
            xp-=100;
        } else if (xp == 100) {
            this.setLevel(level+=1);
            xp = 0;
        }
    }

    @Override
    public String toString() {
        return "Player :" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", xp=" + xp +
                '.';
    }

    public void postQuest(){
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("Le joueur %s effectue la quête n°%d \n",this.name,j);
            }
            this.increasesLevel();
            System.out.printf("Le joueur %s passe au niveau : %d \n",this.name,i);
        }
    }
}
