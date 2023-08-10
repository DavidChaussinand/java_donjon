import Weapons.*;
import Weapons.ArmeWarrior.ArmeWarrior;
import Weapons.ArmeWarrior.Mace;
import Weapons.ArmeWarrior.Sword;
import Weapons.ArmeWizard.FireBall;
import Weapons.ArmeWizard.Lightning;
import characters.Character;
import characters.Warrior;
import ennemy.Dragon;
import ennemy.Ennemi;
import components.*;
import ennemy.Goblin;
import ennemy.Sorcerer;
import exceptions.PersonnageHorsPlateauException;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private int boardGame;
    private int positionPlayer;
    private int tour;


    private ArrayList<Case> board;

    public Game(){
        initializationBoard();
    }

    public void initializationBoard(){
        this.board= new ArrayList<>();
        this.board.add(new CaseEmpty("case", "vide"));
        this.board.add(new Mace("case massue","massue"));
        this.board.add(new Sword("case épée", "épéé lunaire"));

    }

    public void play(Character perso) throws PersonnageHorsPlateauException {
        Menu dice = new Menu();
        boolean playInProgess = true;
        Character perso1 = new Warrior();


        System.out.println("la parti est : " + playInProgess);
        int i = 0;

        while (this.positionPlayer < this.board.size() && playInProgess){
                System.out.println(perso1);
                int move = dice.rollTheDice();
                this.positionPlayer = this.positionPlayer + move;

                Case currentCase = board.get(i);
                System.out.println(currentCase);

                System.out.println(this.board.get(this.positionPlayer-1));    // tableau commence index 0, la position du joueur est à 1 : donc positionJoueur -1 .
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
            i++;


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



    public int getBoardGame() {
        return this.boardGame;
    }

    public void setBoardGame(int boardGame) {
        this.boardGame = boardGame;
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