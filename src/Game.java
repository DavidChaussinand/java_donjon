import components.DiceInterface;
import components.TwoDice;
import exceptions.PersonnageHorsPlateauException;

import java.util.Scanner;

public class Game {

    private int boardGame;
    private int positionPlayer;
    private int tour;
    private int nbGame;

    public Game(int boardGame, int positionPlayer, int tour){
        this.boardGame = boardGame;
        this.positionPlayer = positionPlayer;
        this.tour = tour;
    }
    public Game(){
        this.positionPlayer = 1;
    }



    public void play() throws PersonnageHorsPlateauException {
        Menu dice = new Menu();

        System.out.println("partie numéro : " + nbGame);
        while (this.positionPlayer < this.boardGame){
            try{
                int move = dice.rollTheDice();
                this.positionPlayer = this.positionPlayer + move;
                this.tour ++ ;
                System.out.println("tour " + tour + ":  le joueur est sur la case " + this.positionPlayer);

                if (this.positionPlayer > this.boardGame){
                    throw new PersonnageHorsPlateauException(" Tu es sorti du plateau : BRAVO");
                }

            } catch (PersonnageHorsPlateauException e){
                System.out.println("vous avez gagné en dépassant la case finale"+ e.getMessage());
            }

        }

        System.out.println("Fin de partie ,vous avez gagné");

        if (this.positionPlayer >= this.boardGame){
            Scanner user_input = new Scanner(System.in);
            System.out.println("tapez 1 : rejouer" +
                    "\ntapez 2 : quitter");

            switch (user_input.next()) {
                case "1":
                    this.positionPlayer = 1;
                    this.tour=1;
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
        DiceInterface dice = new TwoDice();
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