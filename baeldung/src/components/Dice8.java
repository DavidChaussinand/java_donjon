package components;


public class Dice8 implements DiceInterface {
    public int rollTheDice(){
        return (int)(Math.random() * 8) +1 ;

    }
}
