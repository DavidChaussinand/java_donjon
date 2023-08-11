package components;

import Weapons.ArmeWarrior.ArmeWarrior;
import Weapons.ArmeWizard.ArmeWizard;
import Weapons.Potion;
import characters.Character;
import characters.Warrior;
import characters.Wizard;

import java.util.ArrayList;

public abstract class Case {

    private String contentCase;
    private Object Case;

    public Case(String contentCase) {
        this.contentCase = contentCase;
    }

    public void interaction(Character character) {

        if (character instanceof Warrior ) {
            if  (this instanceof ArmeWizard){
                System.out.println("certe arme est pour un magicien N'y touche pas ");
            }
            if (this instanceof ArmeWarrior){
                System.out.println("prend cette arme guerrier");
            } if (this instanceof Potion){
                System.out.println(" prend mon ami");
            }

        }
        else if (character instanceof Wizard) {
            if  (this instanceof ArmeWizard){
                System.out.println(" magicien prend ton arme");
            }
            if (this instanceof ArmeWarrior){
                System.out.println("cette arme est pour un guerrier, pas touche");
            }
            if (this instanceof Potion){
                System.out.println(" prend mon ami");
            }
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
