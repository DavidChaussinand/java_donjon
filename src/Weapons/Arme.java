package Weapons;

import components.Case;

public class Arme extends Case {






    public Arme(String contentCase) {
        super(contentCase);

    }

    @Override
    public String toString() {
        return "Arme{" +
                "contentCase = " + this.getContentCase() +
               '}';
    }




}