import java.util.Scanner;

public class Game {
    private int boardGame = 64;
    public int startCasePlayer = 1;
    public int tour = 0;
    public int nbGame = 1;

    public int seDeplacer(){
        int virtualDice = (int)(Math.random() * 6) +1;;  // permet d'avoir un chiffre aléatoire en 1 et 6
        return virtualDice;
    }

    public void play(){
        System.out.println("partie numéro : " + nbGame);
        while (startCasePlayer < boardGame){
            startCasePlayer = startCasePlayer + seDeplacer();
            tour ++ ;
            System.out.println("tour " + tour + ":  le joueur est sur la case " + startCasePlayer);
        }

        System.out.println("fin de partie ");

        if (startCasePlayer >= boardGame){
            Scanner user_input = new Scanner(System.in);
            System.out.println("tapez 1 : rejouer" +
                    "\ntapez 2 : quitter");

            switch (user_input.next()) {
                case "1":
                    startCasePlayer = 1;
                    tour=0;
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




}