package components;

public class Dice6 implements DiceInterface{
    public int rollTheDice(){
        return (int)(Math.random() * 6) +1 ;
    }



}
