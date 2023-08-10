package ennemy;

public class Goblin extends Ennemi{
    private int attackForce;
    private int levelOfLife;

    public Goblin(String contentCase) {
        super(contentCase);
        this.levelOfLife = 6;
        this.attackForce = 1;

    }


    @Override
    public String toString() {
        return "Goblin {" +
                this.getContentCase() +
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


