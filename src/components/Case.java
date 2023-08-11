package components;

import Weapons.ArmeWarrior.ArmeWarrior;
import Weapons.ArmeWarrior.Mace;
import Weapons.ArmeWarrior.Sword;
import Weapons.ArmeWizard.ArmeWizard;
import Weapons.Potion;
import characters.Character;
import characters.Warrior;
import characters.Wizard;
import ennemy.Ennemi;

import java.util.ArrayList;

public abstract class Case {

    private String name;
    private Object Case;

    public Case(String name) {
        this.name = name;
    }

    public abstract void interaction (Character character);





    @Override
    public String toString() {
        return "Case{" +
                "nameCase='" + this.name + '\'' +
                '}';
    }


    public String getName() {
        return this.name;
    }

    public void setName(String contentCase) {
        this.name = contentCase;
    }

}
