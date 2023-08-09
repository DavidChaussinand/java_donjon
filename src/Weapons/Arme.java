package Weapons;

import components.Case;

public class Arme extends Case {




    private String nom;

    private int weaponAttackLevel;

    public Arme(String contentCase, String nom, int weaponAttackLevel) {
        super(contentCase);
        this.nom = nom;
        this.weaponAttackLevel = weaponAttackLevel;
    }

    @Override
    public String toString() {
        return "Arme{" +
                "contentCase = " + this.getContentCase() +
                "nom='" + nom + '\'' +
                ", weaponAttackLevel=" + weaponAttackLevel +
                '}';
    }





    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getWeaponAttackLevel() {
        return this.weaponAttackLevel;
    }

    public void setWeaponAttackLevel(int weaponAttackLevel) {
        this.weaponAttackLevel = weaponAttackLevel;
    }


}
