package ennemy;

import components.Case;

public class Ennemi extends Case {




    public Ennemi(String contentCase) {
        super(contentCase);
            }

    @Override
    public String toString() {
        return "Ennemi{ "  +
                "contentCase = " + this.getContentCase() +
                '}';
    }





}
