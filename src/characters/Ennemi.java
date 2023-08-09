package characters;

import components.Case;

public class Ennemi extends Case {
    private int levelOfLife;
    private int attackForce;



    public Ennemi(String contentCase, int levelOfLife, int attackForce) {
        super(contentCase);
        this.levelOfLife = levelOfLife;
        this.attackForce = attackForce;
    }

    @Override
    public String toString() {
        return "Ennemi{ "  +
                "contentCase = " + this.getContentCase() +
                " levelOfLife = " + this.levelOfLife +
                ", attackForce = " + this.attackForce +
                '}';
    }




}
