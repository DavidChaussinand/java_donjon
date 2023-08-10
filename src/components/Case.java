package components;

import Weapons.ArmeWarrior.ArmeWarrior;
import Weapons.ArmeWizard.ArmeWizard;
import Weapons.Potion;
import characters.Character;
import characters.Warrior;
import characters.Wizard;

public abstract class Case {

    private String contentCase;
    private Object Case;

    public Case(String contentCase) {
        this.contentCase = contentCase;
    }

    public String interaction(Character character) {


        if (character instanceof Warrior ){
            return "tu peux ramasser ton arme guerrier";
        } else if (character instanceof Wizard){
            return "certe arme est pour un magicien";
        } else {
            return " prend mon ami";
        }

    }



    @Override
    public String toString() {
        return "Case{" +
                "contentCase='" + this.contentCase + '\'' +
                '}';
    }


    public String getContentCase() {
        return this.contentCase;
    }

    public void setContentCase(String contentCase) {
        this.contentCase = contentCase;
    }

}
