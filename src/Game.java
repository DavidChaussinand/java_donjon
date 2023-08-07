import java.util.Scanner;

public class Game {

    private int boardGame;
    public int positionPlayer;
    public int tour;
    public int nbGame;

    public Game(int boardGame, int positionPlayer, int tour){
        this.boardGame = boardGame;
        this.positionPlayer = positionPlayer;
        this.tour = tour;
    }

    public int seDeplacer(){
        int virtualDice = (int)(Math.random() * 6) +1;;  // permet d'avoir un chiffre aléatoire en 1 et 6
        return virtualDice;
    }



    public void play() throws PersonnageHorsPlateauException {

        System.out.println("partie numéro : " + nbGame);
        while (this.positionPlayer < this.boardGame){

            this.positionPlayer = this.positionPlayer + seDeplacer();
            this.tour ++ ;

            if (this.positionPlayer > this.boardGame){
                throw new PersonnageHorsPlateauException("Tu es sorti du plateau : game over");
            }

            System.out.println("tour " + tour + ":  le joueur est sur la case " + this.positionPlayer);


        }

        System.out.println("fin de partie ,vous avez gagné");

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




}