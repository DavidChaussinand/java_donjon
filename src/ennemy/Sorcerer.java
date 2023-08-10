package ennemy;

public class Sorcerer extends Ennemi{
    private int attackForce;
    private int levelOfLife;

    public Sorcerer(String contentCase) {
        super(contentCase);
        this.levelOfLife = 9;
        this.attackForce = 2;

    }


    @Override
    public String toString() {
        return "Sorcier{" +
                this.getContentCase() +
                ",  attackForce = " + this.attackForce +
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
