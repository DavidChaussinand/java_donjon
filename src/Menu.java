import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private boolean quit = false;

    public void showMenu(){


        System.out.println("voici le menu :  choix ");
        System.out.println("tapez 1  : pour créer un guerrier ");
        System.out.println("tapez 2  : pour créer un magicien");
        System.out.println("tapez 3  : pour afficher les infos du personnage ");
        System.out.println("tapez 4  : pour modifier les infos du personnage ");
        System.out.println("tapez 5  : pour quitter ");

    }


    public void menu() {

        Scanner sc = new Scanner(System.in);
        showMenu();
        switch (sc.next()) {
            case "1":
                Warrior guerrier = createWarrior();
                menu();
                break;
            case "2":
                Wizard magicien = createWizard();
                menu();
                break;

            case "3":
                System.out.println("merci d'avoir quitter");
                return;
            default:
                System.out.println("choose from 1 to 3");
                menu();

        }
    }

    public void MenuDansCreation (String saisie){
        ArrayList<String> info = new ArrayList<String>();
        Scanner clavier = new Scanner(System.in);
        System.out.println("tapez 1 : pour afficher info du perso en cours de création"+
                "\ntapez 2 : pour modifier ses infos"+
                "\ntapez 3 : quitter ");

        if (clavier.nextInt()== 1 ){
            System.out.println(saisie);
        } else if (clavier.nextInt()== 2){
            saisie = clavier.nextLine();;
        } else if (clavier.nextInt()==3){
            return;
        }
        info.add(saisie);
    }

    public Warrior createWarrior(){
        ArrayList<String> info = new ArrayList<String>();
        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir votre nom de guerrier : ");
        String name = clavier.nextLine();
        info.add(name + " ");
        MenuDansCreation(name);

        System.out.print("Saisir vos points de vie entre 5 et 10 : ");
        int levelOfLife = clavier.nextInt();
        info.add(levelOfLife + " ");
        MenuDansCreation(name);

        System.out.print("Saisir votre force d'attaquer entre 5 et 10 : ");
        int attackForce = clavier.nextInt();
        info.add(attackForce + " ");
        MenuDansCreation(name);


        return new Warrior(name,levelOfLife,attackForce);

    }
    public Wizard createWizard(){
        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir votre nom du magicien : ");
        String name = clavier.nextLine();
        System.out.print("Saisir vos points de vie entre 3 et 6 : ");
        int levelOfLife = clavier.nextInt();
        System.out.print("Saisir votre force d'attaquer entre 8 et 15 : ");
        int attackForce = clavier.nextInt();
        return new Wizard(name,levelOfLife,attackForce);

    }

    public void afficherPersonnage(){

    }

    public void modifierPersonnage(){
        System.out.println("player");
    }






}










