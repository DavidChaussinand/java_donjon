import java.awt.Image;

public class Wizard extends Character{

    private String spellName;

    private int spellAttackLevel;
    private String potion;


    public Wizard (String name , int levelOfLife, int attackForce){
        super(name,levelOfLife,attackForce);
        this.spellName = "eclair";
        this.spellAttackLevel = 2;
    }



    public Wizard (String name, int levelOfLife, int attackForce, String spellName, int spellAttackLevel , String potion){
        super(name,levelOfLife,attackForce);
        this.spellName = "eclair";
        this.spellAttackLevel = 2;
        this.potion = potion;

    }




    @Override
    public String toString() {
        return "le nom du magicien est "+ this.getName() +
                " \nson niveau de vie est de " + this.getLevelOfLife() +
                " \nil a une force d'attaque de " + this.getAttackForce()+
                " \nSon sort est  " + this.spellName+
                " \nDe force  " + this.spellAttackLevel;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getSpellAttackLevel() {
        return spellAttackLevel;
    }

    public void setSpellAttackLevel(int spellAttackLevel) {
        this.spellAttackLevel = spellAttackLevel;
    }

    public String getPotion() {
        return potion;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }











}











