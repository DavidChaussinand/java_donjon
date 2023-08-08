import Weapons.Weapon;
import characters.Warrior;
import exceptions.PersonnageHorsPlateauException;

public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException {

        Menu menu = new Menu();
       // menu.menu();


        Warrior perso = new Warrior("david",1,1,"bouclier",new Weapon("main nue",2));
        System.out.println(perso);


    }





}