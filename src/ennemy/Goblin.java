package ennemy;

import characters.Character;

public class Goblin extends Ennemi{
    private int attackForce;
    private int levelOfLife;

    public Goblin() {
        super("goblin");
        this.levelOfLife = 6;
        this.attackForce = 1;

    }

    public void interaction(Character character){

        if (this instanceof Goblin){
            System.out.println("Un Goblin arrive");
            //character.setAttackForce(character.getAttackForce()+5);
        }

    }


    @Override
    public String toString() {
        return "Goblin {" +
                this.getName()+
                " , attackForce = " + this.attackForce +
                ", levelOfLife = " + this.levelOfLife +
                '}';
    }

    public int getAttackForce() {
        return this.attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

    public int getLevelOfLife() {
        return this.levelOfLife;
    }

    public void setLevelOfLife(int levelOfLife) {
        this.levelOfLife = levelOfLife;
    }


}


