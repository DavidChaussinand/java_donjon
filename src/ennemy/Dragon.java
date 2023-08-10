package ennemy;

public class Dragon extends Ennemi{

    private int attackForce;
    private int levelOfLife;

    public Dragon(String contentCase) {
        super(contentCase);
        this.levelOfLife = 15;
        this.attackForce = 4;

    }


    @Override
    public String toString() {
        return "Dragon{" +
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
