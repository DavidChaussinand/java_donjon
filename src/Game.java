import Weapons.Arme;
import Weapons.Potion;
import characters.Ennemi;
import components.*;
import exceptions.IndexOutOfBoundsException;
import exceptions.PersonnageHorsPlateauException;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private int boardGame;
    private int positionPlayer;
    private int tour;
    private int nbGame= 1;

    ArrayList<Case> board;






//    public Game(int boardGame, int positionPlayer, int tour){
//        this.boardGame = boardGame;
//        this.positionPlayer = positionPlayer;
//        this.tour = tour;
//    }

    public Game(){
        initializationBoard();
    }

    public void initializationBoard(){
        this.board= new ArrayList<>();
        this.board.add(new CaseEmpty("case", "vide"));
        this.board.add(new Ennemi("ennemi",1,2));
        this.board.add(new Arme("case Arme","Epée",5));
        this.board.add(new Potion("potion magique","soin",2));
    }

    public void play() throws PersonnageHorsPlateauException {
        Menu dice = new Menu();
        System.out.println("partie numéro : " + nbGame);
        boolean playInProgess = true;
        System.out.println("la parti est : " + playInProgess);
        while (this.positionPlayer < this.board.size() && playInProgess){

                int move = dice.rollTheDice();
                this.positionPlayer = this.positionPlayer + move;
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
                    nbGame++;
                    play();
                    break;
                case "2":
                    System.out.println("merci d'avoir jouer , au revoir");
                    return;

                default:
                    System.out.println("choose from 1 to 2");
            }
        }
    }

    public int seDeplacer(){
        DiceInterface dice = new FakeDice();
        return dice.rollTheDice();
    }

    public int getBoardGame() {
        return boardGame;
    }

    public void setBoardGame(int boardGame) {
        this.boardGame = boardGame;
    }

    public int getPositionPlayer() {
        return positionPlayer;
    }

    public void setPositionPlayer(int positionPlayer) {
        this.positionPlayer = positionPlayer;
    }

    public int getTour() {
        return tour;
    }

    public void setTour(int tour) {
        this.tour = tour;
    }

    public int getNbGame() {
        return nbGame;
    }

    public void setNbGame(int nbGame) {
        this.nbGame = nbGame;
    }




}