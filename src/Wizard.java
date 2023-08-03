import java.awt.Image;

public class Wizard {
    private String name;
    private int levelOfLife;
    private int attackForce;
    private String spell;
    private String potion;


    public Wizard (String Name, int levelOfLife, int attackForce ){
        this.name = name;
        this.levelOfLife = levelOfLife;
        this.attackForce = attackForce;
        //this.img = img;
    }
    public Wizard (String Name){
        this.name = name;
    }

    public Wizard() {
        this.name= "Gandalf";
        this.levelOfLife = 0;
        this.attackForce= 0;
      //  this.img;
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

    public String getSpell() {
        return spell;
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

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }



}








