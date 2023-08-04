import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Menu {


    public void showMenu(){


        System.out.println("voici le menu :  choix ");
        System.out.println("tapez 1  : pour créer un guerrier ");
        System.out.println("tapez 2  : pour créer un magicien");
        System.out.println("tapez 3  : pour démarrer le jeu");
        System.out.println("tapez 4  : pour quitter");
    }


    public void menu() {

        Scanner user_input = new Scanner(System.in);
        showMenu();

        switch (user_input.next()) {
            case "1":
                Warrior dede = createWarrior();
                System.out.println(dede);
                menu();
                break;
            case "2":
                createWizard();
                menu();
                break;
            case "3":
                System.out.println("game la partie");
                break;
            case "4":
                System.out.println("merci d'avoir quitter enfoiré");
                return;
            default:
                System.out.println("choose from 1 to 4");
                menu();

        }
    }
    public void MenuDansCreation(String name, int levelOfLife, int attackForce) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("tapez 1 : pour afficher les infos du perso en cours de création" +
                "\ntapez 2 : pour modifier ses infos" +
                "\ntapez 3 : quitter pour retourner à la création");

        String choix = user_input.next();

        if (Objects.equals(choix, "1")) {
            System.out.println("Nom: " + name);
            System.out.println("Points de vie: " + levelOfLife);
            System.out.println("Force d'attaque: " + attackForce);
        } else if (Objects.equals(choix, "2")) {
            user_input.nextLine();
            System.out.print("Nouveau nom : ");
            name = user_input.nextLine();
            System.out.print("Nouvelle valeur des points de vie : ");
            levelOfLife = user_input.nextInt();
            System.out.print("Nouvelle valeur de la force d'attaque : ");
            attackForce = user_input.nextInt();
        } else if (Objects.equals(choix, "3")) {
            return;
        }

        MenuDansCreation(name, levelOfLife, attackForce);
    }

    public Warrior createWarrior() {
        Scanner user_input = new Scanner(System.in);
        int levelOfLife = 0;
        int attackForce = 0;

        System.out.print("Saisir votre nom de guerrier : ");
        String name = user_input.nextLine();
        MenuDansCreation(name, levelOfLife, attackForce);

        System.out.print("Saisir votre niveau de vie entre 5 et 10: ");
        levelOfLife = user_input.nextInt();
        user_input.nextLine();
        MenuDansCreation(name, levelOfLife, attackForce);

        System.out.print("Saisir votre niveau de force entre 5 et 10 : ");
        attackForce = user_input.nextInt();
        user_input.nextLine();
        MenuDansCreation(name, levelOfLife, attackForce);

        return new Warrior(name, levelOfLife, attackForce);
    }

    public Wizard createWizard(){
        Scanner user_input = new Scanner(System.in);
        int levelOfLife = 0;
        int attackForce = 0;

        System.out.print("Saisir votre nom du magicien : ");
        String name = user_input.nextLine();
        MenuDansCreation(name, levelOfLife, attackForce);

        System.out.print("Saisir vos points de vie entre 3 et 6 : ");
        levelOfLife = user_input.nextInt();
        MenuDansCreation(name, levelOfLife, attackForce);

        System.out.print("Saisir votre force d'attaquer entre 8 et 15 : ");
        attackForce = user_input.nextInt();

        MenuDansCreation(name, levelOfLife, attackForce);
        return new Wizard(name,levelOfLife,attackForce);

    }




}










