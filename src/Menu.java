import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
  

    public void showMenu(){


        System.out.println("voici le menu :  choix ");
        System.out.println("tapez 1  : pour créer un guerrier ");
        System.out.println("tapez 2  : pour créer un magicien");
        System.out.println("tapez 3  : pour quitter");
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
    public void MenuDansCreation(String name, int levelOfLife, int attackForce) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("tapez 1 : pour afficher les infos du perso en cours de création" +
                "\ntapez 2 : pour modifier ses infos" +
                "\ntapez 3 : quitter ");
    
        int choix = Integer.parseInt(clavier.nextLine());
    
        if (choix == 1) {
            System.out.println("Nom: " + name);
            System.out.println("Points de vie: " + levelOfLife);
            System.out.println("Force d'attaque: " + attackForce);
        } else if (choix == 2) {
            System.out.print("Nouveau nom : ");
            name = clavier.nextLine();
            System.out.print("Nouvelle valeur des points de vie : ");
            levelOfLife = Integer.parseInt(clavier.nextLine());
            System.out.print("Nouvelle valeur de la force d'attaque : ");
            attackForce = Integer.parseInt(clavier.nextLine());
        } else if (choix == 3) {
            return;
        }
    
        MenuDansCreation(name, levelOfLife, attackForce);
    }
    
    public Warrior createWarrior() {
        Scanner clavier = new Scanner(System.in);
        int levelOfLife = 0;
        int attackForce = 0;
    
        System.out.print("Saisir votre nom de guerrier : ");
        String name = clavier.nextLine();  
        MenuDansCreation(name, levelOfLife, attackForce);
        System.out.print("Saisir votre niveau de vie entre 5 et 10: ");
        levelOfLife = clavier.nextInt();
        clavier.nextLine(); // Consommer la nouvelle ligne restante après clavier.nextInt()
        MenuDansCreation(name, levelOfLife, attackForce);
        System.out.print("Saisir votre niveau de force entre 5 et 10 : ");
        attackForce = clavier.nextInt();
        clavier.nextLine(); 
        MenuDansCreation(name, levelOfLife, attackForce);

        return new Warrior(name, levelOfLife, attackForce);
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










