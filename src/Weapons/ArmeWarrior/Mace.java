package Weapons.ArmeWarrior;

import Weapons.ArmeWarrior.ArmeWarrior;

public class Mace extends ArmeWarrior {



    private int increaseAttack;



    public Mace(String contentCase, String name) {
        super(contentCase,name);
        this.increaseAttack = 3;

    }


    @Override
    public String toString() {
        return "Mace{" +
                this.getContentCase() +
                ",  name ='" + this.getName() + '\'' +
                ", increaseAttack=" + this.increaseAttack +
                '}';
    }


    public int getIncreaseAttack() {
        return this.increaseAttack;
    }

    public void setIncreaseAttack(int increaseAttack) {
        this.increaseAttack = increaseAttack;
    }
}
