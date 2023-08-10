package components;

import characters.Character;
import characters.Warrior;
import characters.Wizard;

public abstract class Case {

    private String contentCase;

    public Case(String contentCase) {
        this.contentCase = contentCase;
    }

    public String interaction(Character character){

        if (character instanceof Warrior){
            return "tu peux ramasser ton arme";
        } else {
            return "Non la massue n'est pas pour un magicien";
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
