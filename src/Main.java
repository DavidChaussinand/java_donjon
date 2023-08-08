import Weapons.Spell;
import Weapons.Weapon;
import characters.Warrior;
import characters.Wizard;
import exceptions.PersonnageHorsPlateauException;

public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException {

        Menu menu = new Menu();
       // menu.menu();


        Wizard perso = new Wizard("david",10,10,"potion",new Spell("eclair de vie",10));
        System.out.println(perso);


    }





}