import java.awt.Image;

public class Wizard {
    private String name;
    private int levelOfLife;
    private int attackForce;
    private String spellName;

    private int spellAttackLevel;
    private String potion;


    public Wizard (String name, int levelOfLife, int attackForce ){
        this.name = name;
        this.levelOfLife = levelOfLife;
        this.attackForce = attackForce;

    }
    public Wizard (String Name){
        this.name = name;
    }

    public Wizard() {
        this.name= "Gandalf";
        this.levelOfLife = 3;
        this.attackForce= 8;
    }




    public String toString() {
        return "le nom du magicien est "+ this.name +
                " \nson niveau de vie est de " + this.levelOfLife +
                " \nil a une force d'attaque de " + this.attackForce;

    }



    public String getName() {
        return name;
    }

    public int getLevelOfLife() {
        return levelOfLife;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public String getSpellName() {
        return spellName;
    }

    public String getPotion() {
        return potion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevelOfLife(int levelOfLife) {
        this.levelOfLife = levelOfLife;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

    public void setSpell(String spellName) {
        this.spellName = spellName;
    }
    public int getSpellAttackLevel() {
        return spellAttackLevel;
    }

    public void setSpellAttackLevel(int spellAttackLevel) {
        this.spellAttackLevel = spellAttackLevel;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }




}











