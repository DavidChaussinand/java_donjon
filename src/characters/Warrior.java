package characters;

import Weapons.Weapon;
import characters.Character;

public class Warrior extends Character {



    private Weapon weapon;
    private String shield;

    public Warrior(){
        super();
        this.weapon = new Weapon("main nue",2);
        this.shield = "bouclier";

    }

    public Warrior (String name , int levelOfLife, int attackForce){
        super(name,levelOfLife,attackForce);
        this.weapon = new Weapon("main nue",2);
        this.shield = "bouclier";
    }

    public Warrior (String name, int levelOfLife, int attackForce, String shield, Weapon weapon){
        super(name,levelOfLife,attackForce);
        this.shield = shield;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Le nom du guerrier est "+ this.getName() +
                " vie :" + this.getLevelOfLife() +
                " force :" + this.getAttackForce()+
                " Son arme est "+ weapon.getWeaponName() +
                " Sa force d'attaque est de "+ weapon.getWeaponAttackLevel();


    }




    public String getShield() {
        return this.shield;
    }
    public void setShield(String shield) {
        this.shield = shield;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }






}