package Weapons;

import components.Case;

public class Potion extends Case {


    private String name;

    private int defense;

    public Potion(String contentCase, String name, int defense) {
        super(contentCase);
        this.name = name;
        this.defense = defense;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


}
