import characters.Character;
import characters.Warrior;
import characters.Wizard;
import exceptions.PersonnageHorsPlateauException;

import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public void menu() throws PersonnageHorsPlateauException {
        Character perso = null;

        Scanner user_input = new Scanner(System.in);
        showMenu();

        switch (user_input.next()) {
            case "1":
                perso = createWarrior();
                System.out.println(perso);
                menu();

                break;
            case "2":
                perso = createWizard();
                System.out.println(perso);

                menu();
                break;
            case "3":

                Game jouer = new Game();
                jouer.play(perso);
                break;
            case "4":
                System.out.println("merci d'avoir quitter");
                return;
            default:
                System.out.println("choose from 1 to 4");
                menu();

        }
    }

    public void showMenu(){


        System.out.println("voici le menu :  choix ");
        System.out.println("tapez 1  : pour créer un guerrier ");
        System.out.println("tapez 2  : pour créer un magicien");
        System.out.println("tapez 3  : pour démarrer le jeu");
        System.out.println("tapez 4  : pour quitter");
    }

    public int rollTheDice (){
        Game dice = new Game();
        Scanner user_input = new Scanner(System.in);
        System.out.println("tapez 1 : pour lancer le dé" +
                "\ntapez 2 : quitter" );
        String choix = user_input.next();

        switch (choix) {
            case "1":
                dice.move();
                break;
            case "2":
                System.out.println("merci d'avoir quitter");
                System.exit(0);
            default:
                System.out.println("choose from 1 to 2");
                rollTheDice();
        }
        return dice.move();

    }

    public Warrior createWarrior() {
        Scanner user_input = new Scanner(System.in);
        Warrior warrior = new Warrior();

        System.out.print("Saisir votre nom de guerrier : ");
        warrior.setName(user_input.nextLine());

        System.out.print("Saisir votre niveau de vie entre 5 et 10: ");
        warrior.setLevelOfLife(user_input.nextInt());
        user_input.nextLine();

        System.out.print("Saisir votre niveau de force entre 5 et 10 : ");
        warrior.setAttackForce(user_input.nextInt());
        user_input.nextLine();

        updateCharacter(warrior);

        return warrior;
    }

    public Wizard createWizard() {
        Scanner user_input = new Scanner(System.in);
        Wizard wizard = new Wizard();

        System.out.print("Saisir votre nom de magicien : ");
        wizard.setName(user_input.nextLine());

        System.out.print("Saisir votre niveau de vie entre 3 et 6: ");
        wizard.setLevelOfLife(user_input.nextInt());
        user_input.nextLine();

        System.out.print("Saisir votre niveau de force entre 8 et 15 : ");
        wizard.setAttackForce(user_input.nextInt());
        user_input.nextLine();

        updateCharacter(wizard);

        return wizard;
    }

    public void updateCharacter(Character character) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("tapez 1 : pour afficher les infos du perso en cours de création" +
                "\ntapez 2 : pour modifier ses infos" +
                "\ntapez 3 : quitter");

        String choix = user_input.next();

        if (Objects.equals(choix, "1")) {
            System.out.println("Nom: " + character.getName());
            System.out.println("Points de vie: " + character.getLevelOfLife());
            System.out.println("Force d'attaque: " + character.getAttackForce());
        } else if (Objects.equals(choix, "2")) {
            user_input.nextLine();
            System.out.print("Nouveau nom : ");
            String newName = user_input.nextLine();
            System.out.print("Nouvelle valeur des points de vie : ");
            int newLevelOfLife = user_input.nextInt();
            System.out.print("Nouvelle valeur de la force d'attaque : ");
            int newAttackForce = user_input.nextInt();

            character.setName(newName);
            character.setLevelOfLife(newLevelOfLife);
            character.setAttackForce(newAttackForce);

        } else if (Objects.equals(choix, "3")) {
            return;
        }

        updateCharacter(character);
    }







}







