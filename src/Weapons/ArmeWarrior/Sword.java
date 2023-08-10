package Weapons.ArmeWarrior;

import Weapons.ArmeWarrior.ArmeWarrior;

public class Sword extends ArmeWarrior {
        private int increaseAttack;



    public Sword(String contentCase, String name) {
        super(contentCase, name);
        this.increaseAttack = 5;

    }

    @Override
    public String toString() {
        return "Sword{" +
                this.getContentCase() +
                ", name='" + this.getName() + '\'' +
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
