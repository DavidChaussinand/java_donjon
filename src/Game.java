import Weapons.*;
import Weapons.ArmeWarrior.ArmeWarrior;
import Weapons.ArmeWarrior.Mace;
import Weapons.ArmeWarrior.Sword;
import Weapons.ArmeWizard.ArmeWizard;
import Weapons.ArmeWizard.FireBall;
import Weapons.ArmeWizard.Lightning;
import characters.Character;
import characters.Warrior;
import characters.Wizard;
import ennemy.Dragon;
import ennemy.Ennemi;
import components.*;
import ennemy.Goblin;
import ennemy.Sorcerer;
import exceptions.PersonnageHorsPlateauException;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {


    private int positionPlayer;
    private int tour;


    private ArrayList<Case> board;

    public Game(){
        initializationBoard();
    }

    public void initializationBoard(){
        this.board= new ArrayList<>();

        for (int i = 1;  i < 65 ; i++){

            if(i == 45 || i == 52 || i == 56 || i == 62){
                this.board.add(new Dragon());
            }
            else if(i == 10 || i == 20 || i == 25 || i == 32 || i == 36 || i == 37 || i == 40 || i == 44 || i == 47){
                this.board.add(new Sorcerer());
            }
            else if(i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18 || i == 21 || i == 24 || i == 27 || i == 30){
                this.board.add(new Goblin());
            }
            else if(i == 2 || i == 11 || i == 5 || i == 22 || i == 38){
                this.board.add(new Mace());
            }

            else if(i == 19 || i == 26 || i == 42 || i == 53){
                this.board.add(new Sword());
            }
            else if(i == 1 || i == 4 || i == 8 || i == 17 || i == 23) {
                this.board.add(new Lightning());
            }

            else if(i == 48 || i == 49 ) {
                this.board.add(new FireBall());
            }
            else if(i == 7 || i == 13 || i == 31 || i == 33 || i == 39 || i == 43) {
                this.board.add(new StandardLifePotion());
            }

            else if(i == 28 || i == 41 ) {
                this.board.add(new BigPotion());;
            }
            else{
                this.board.add(new CaseEmpty());
            }


        }









    }

    public void play(Character perso) throws PersonnageHorsPlateauException {
        Menu dice = new Menu();
        boolean playInProgess = true;

        Character perso1 = new Wizard("dada",5,5,"oui",new Spell("rien",0));
        System.out.println(perso1);


        System.out.println("la parti est : " + playInProgess + "\n");
        int j = 0;

        while (this.positionPlayer < this.board.size() && playInProgess){

                int move = dice.rollTheDice();
                this.positionPlayer = this.positionPlayer + move;

                Case currentCase = board.get(j);
                System.out.println(this.board.get(this.positionPlayer-1));    // tableau commence index 0, la position du joueur est à 1 : donc positionJoueur -1 .
                currentCase.interaction(perso1);
                System.out.println(perso1);

                System.out.println("la parti est : " + playInProgess);

                this.tour ++ ;

                System.out.println("tour " + tour + ":  le joueur est sur la case " + this.positionPlayer);
            try{
                if (this.positionPlayer > this.board.size()){
                    throw new PersonnageHorsPlateauException(" Tu es sorti du plateau : BRAVO");
                }

            } catch (PersonnageHorsPlateauException e){
                System.out.println("vous avez gagné en dépassant la case finale"+ e.getMessage());
                playInProgess = false;
                System.out.println("la parti est : " + playInProgess);
            }
            j++;


        }
        System.out.println("Fin de partie ,vous avez gagné");

        if (this.positionPlayer >= this.board.size()){
            Scanner user_input = new Scanner(System.in);
            System.out.println("tapez 1 : rejouer" +
                    "\ntapez 2 : quitter");

            switch (user_input.next()) {
                case "1":
                    this.positionPlayer = 0;
                    this.tour=0;
                    play(perso) ;
                    break;
                case "2":
                    System.out.println("merci d'avoir jouer , au revoir");
                    return;

                default:
                    System.out.println("choose from 1 to 2");
            }
        }
    }

    public int move(){
        DiceInterface dice = new FakeDice();
        return dice.rollTheDice();
    }





    public int getPositionPlayer() {
        return this.positionPlayer;
    }

    public void setPositionPlayer(int positionPlayer) {
        this.positionPlayer = positionPlayer;
    }

    public int getTour() {
        return this.tour;
    }

    public void setTour(int tour) {
        this.tour = tour;
    }






}