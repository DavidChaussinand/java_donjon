import Weapons.Spell;
import Weapons.Weapon;
import characters.Character;
import characters.Warrior;
import characters.Wizard;
import database.Database;
import exceptions.PersonnageHorsPlateauException;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private List<Character> charactersList = new ArrayList<>();


    public void menu() throws PersonnageHorsPlateauException, SQLException {

        Scanner user_input = new Scanner(System.in);
        getHeroes();

        boolean keepGoing = true;
        while (keepGoing) {
            showMenu();

            switch (user_input.next()) {

                case "1":
                    if (!charactersList.isEmpty()) {
                        System.out.println("Choisissez un personnage : ");
                        for (int i = 0; i < charactersList.size(); i++) {
                            System.out.println((i + 1) + ". " + charactersList.get(i).toString());
                        }
                        int choice = user_input.nextInt();
                        Character selectedCharacter = charactersList.get(choice - 1); // -1 car l'index commence à 0
                        Game jouer = new Game();
                        jouer.play(selectedCharacter);
                    } else {
                        System.out.println("Créez d'abord un personnage !");
                    }
                    break;

                case "2":
                    System.out.println("merci d'avoir quitté");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("choose from 1 to 2");
                    break;
            }
        }
    }
    public void getHeroes() throws SQLException {
        Connection connection = Database.getConnection();
       // System.out.println("Connecté à la base de données !");

        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM hero";

        // exécution de la requête
        ResultSet resultat = statement.executeQuery(sql);

        // Récupération des données
        while (resultat.next()) {
            int id = resultat.getInt("Id");
            String type = resultat.getString("Type");
            String nom = resultat.getString("Nom");
            int niveauVie = resultat.getInt("NiveauVie");
            int niveauForce = resultat.getInt("NiveauForce");
            String armeSort = resultat.getString("ArmeSort");
            String bouclier = resultat.getString("Bouclier");

            Character character;
            if (type.equals("guerrier")) {
                character = new Warrior();
                ((Warrior) character).setShield(bouclier);
                Weapon weapon = new Weapon(armeSort, niveauForce);
                ((Warrior) character).setWeapon(weapon);


            } else if (type.equals("Magicien")) {
                character = new Wizard();
                Spell weapon = new Spell(armeSort,niveauForce);
                ((Wizard) character).setSpell(weapon);

            } else {
                System.out.println("Type de personnage non reconnu : " + type);
                character = new Warrior();
            }

            character.setName(nom);
            character.setLevelOfLife(niveauVie);
            character.setAttackForce(niveauForce);

            charactersList.add(character);


        }
        connection.close();
    }



    public void showMenu(){


        System.out.println("voici le menu :  choix ");
        System.out.println("tapez 1  : pour démarrer le jeu");
        System.out.println("tapez 2 : pour quitter");
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
        charactersList.add(warrior);
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
        charactersList.add(wizard);
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







