package Weapons.ArmeWizard;

public class FireBall extends ArmeWizard{

    private int increaseAttack;


    public FireBall(String contentCase, String name) {
        super(contentCase, name);
        this.increaseAttack = 7;
    }



    @Override
    public String toString() {
        return "FireBall{" +
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
