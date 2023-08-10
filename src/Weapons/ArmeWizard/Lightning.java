package Weapons.ArmeWizard;

public class Lightning extends ArmeWizard{

    private int increaseAttack;



    public Lightning(String contentCase, String name) {
        super(contentCase, name);
        this.increaseAttack = 2;

    }

    @Override
    public String toString() {
        return "Lightning{" +
                this.getContentCase() +
                ", name='" + this.getName() + '\'' +
                ", increaseAttack=" + this.increaseAttack +
                '}';
    }

    public int getIncreaseAttack() {
        return this.increaseAttack;
    }

    public void setIncreaseAttack(int increaseAttack) {
        this.increaseAttack = increaseAttack;
    }
}


