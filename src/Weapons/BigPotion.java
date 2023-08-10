package Weapons;

public class BigPotion extends Potion{
    private String name;
    private int increaseLIfe;



    public BigPotion(String contentCase) {
        super(contentCase);
        this.name = "Grande Potion de vie";
        this.increaseLIfe = 5;

    }

    @Override
    public String toString() {
        return "BigPotion{" +
                this.getContentCase() +
                ", name='" + this.name + '\'' +
                ", increaseLife=" + this.increaseLIfe +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncreaseAttack() {
        return this.increaseLIfe;
    }

    public void setIncreaseAttack(int increaseAttack) {
        this.increaseLIfe = increaseAttack;
    }
}


