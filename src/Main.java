
public class Main {
    public static void main(String[] args) {
        Warrior david = new Warrior("david",10,10);
        david.setWeaponAttackLevel(50);
        System.out.println(david.getWeaponAttackLevel());

        Menu menu = new Menu();

        //
        // menu.menu();

        Game play1 = new Game();
        play1.play();
        play1.play();
    }





}