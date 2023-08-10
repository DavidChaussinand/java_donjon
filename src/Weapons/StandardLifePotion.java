package Weapons;

public class StandardLifePotion extends Potion {
    private String name;
    private int increaseLIfe;



    public StandardLifePotion(String contentCase) {
        super(contentCase);
        this.name = "Potion de vie standard";
        this.increaseLIfe = 2;

    }

    @Override
    public String toString() {
        return "Potion Standard{" +
                this.getContentCase() +
                " , name='" + this.name + '\'' +
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

