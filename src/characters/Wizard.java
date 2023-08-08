package characters;

import Weapons.Spell;
import characters.Character;

public class Wizard extends Character {



    private Spell spell;
    private String potion;

    public Wizard(){
        super();
        this.spell = new Spell("eclair",2);
        this.potion = "potion de vie";

    }


    public Wizard (String name , int levelOfLife, int attackForce){
        super(name,levelOfLife,attackForce);
        this.spell = new Spell("eclair",2);
        this.potion = "potion de vie";
    }



    public Wizard (String name, int levelOfLife, int attackForce , String potion , Spell spell){
        super(name,levelOfLife,attackForce);
        this.potion = potion;
        this.spell = spell;


    }




    @Override
    public String toString() {
        return "le nom du magicien est "+ this.getName() +
                " \nson niveau de vie est de " + this.getLevelOfLife() +
                " \nil a une force d'attaque de " + this.getAttackForce()
                ;
    }



    public String getPotion() {
        return potion;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }











}











