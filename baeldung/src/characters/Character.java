package characters;

import Weapons.Arme;
import Weapons.Spell;

public abstract class Character {

    private String name;
    private int levelOfLife;
    private int attackForce;
    private Arme arme;
    private Spell sort;


    public Character (String name, int levelOfLife, int attackForce  ){
        this.name = name;
        this.levelOfLife = levelOfLife;
        this.attackForce = attackForce;
    }
    public Character (String name){
        this();
        this.name = name;

    }
    public Character() {
        this.name = "ragnard";
        this.levelOfLife = 1;
        this.attackForce= 1;
    }



    @Override
    public String toString() {
        return "characters.Character{" +
                "name='" + this.name + '\'' +
                ", levelOfLife=" + this.levelOfLife +
                ", attackForce=" + this.attackForce +
                '}';
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelOfLife() {
        return this.levelOfLife;
    }

    public void setLevelOfLife(int levelOfLife) {
        this.levelOfLife = levelOfLife;
    }

    public int getAttackForce() {
        return this.attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

}
