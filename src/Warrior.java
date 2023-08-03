import java.util.Scanner;

public class Warrior {

        private String name;
        private int levelOfLife;
        private int attackForce;
        private String weapon;
        private String shield;


        public Warrior (String name, int levelOfLife, int attackForce ){
            this.name = name;
            this.levelOfLife = levelOfLife;
            this.attackForce = attackForce;

        }
        public Warrior (String name){
            this.name = name;
        }

        public Warrior() {
            this.name= "ragnar";
            this.levelOfLife = 8;
            this.attackForce= 8;

        }





        public String toString() {
            return " le nom du guerrier est "+ this.name+
                    " \nson niveau de vie est de " + this.levelOfLife +
                    " \nil a une force d'attaque de " + this.attackForce;


        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelOfLife() {
        return levelOfLife;
    }

    public void setLevelOfLife(int levelOfLife) {
        this.levelOfLife = levelOfLife;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public String getShield() {
        return shield;
    }
    public void setShield(String shield) {
        this.shield = shield;
    }


}
