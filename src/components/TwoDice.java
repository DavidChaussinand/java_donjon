package components;

public class TwoDice implements DiceInterface{

    public int rollTheDice(){
        Dice6 dice1 = new Dice6();
        Dice6 dice2 = new Dice6();
        return dice1.rollTheDice() + dice2.rollTheDice();

    }
}
