import java.util.Scanner;

public class Warrior extends Character{

    private String weaponName;
    private int weaponAttackLevel;
    private String shield;

    public Warrior(){
        this.setLevelOfLife(5);
        this.setAttackForce(5);
        this.shield = shield;
        this.weaponName = "épée";
        this.weaponAttackLevel = 5;
    }

    public Warrior (String name , int levelOfLife, int attackForce){
        super(name,levelOfLife,attackForce);
        this.weaponName = "épée";
        this.weaponAttackLevel = 5;
        this.shield = shield;
    }

    public Warrior (String name, int levelOfLife, int attackForce, String weaponName, int weaponAttackLevel , String shield){
        super(name,levelOfLife,attackForce);
        this.weaponName = "épée";
        this.weaponAttackLevel = 5;
        this.shield = shield;

    }

    @Override
    public String toString() {
        return "Le nom du guerrier est "+ this.getName() +
                " \nSon niveau de vie est de " + this.getLevelOfLife() +
                " \nIl a une force d'attaque de " + this.getAttackForce()+
                " \nSon arme est  " + this.weaponName+
                " \nDe force  " + this.weaponAttackLevel;

    }


    public String getWeaponName() {
        return this.weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getShield() {
        return this.shield;
    }
    public void setShield(String shield) {
        this.shield = shield;
    }


    public int getWeaponAttackLevel() {
        return this.weaponAttackLevel;
    }

    public void setWeaponAttackLevel(int weaponAttackLevel) {
        this.weaponAttackLevel = weaponAttackLevel;
    }



}