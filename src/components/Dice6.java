package components;

public class Dice6 implements DiceInterface{
    public int rollTheDice(){
        return (int)(Math.random() * 64) +1 ;
    }



}
