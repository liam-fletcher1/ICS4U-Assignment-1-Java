/*
 * The rock, paper or scissors program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-11-30
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //Initialize the Scanner 
        Scanner in = new Scanner(System.in);
        System.out.println("Lets play Rock, Paper, Scissors!");


        while (true) {

            //Get the user's move 
            System.out.print("Enter your move? Enter rock, paper, or scissors. To quit the game, enter quit. ");
            String myMove = in .nextLine();

            //Check if the user wants to quit the game
            if (myMove.equals("quit")) {
                break;
            }

            //Check if the user's move is valid 
            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

                System.out.println("Invaild Input");

            } else {

                //Get a random number in between 0 and 3 
                int rand = (int)(Math.random() * 3);

                //Convert the random number to a string 
                String opponentMove = "";
                if (rand == 0) {
                    opponentMove = "rock";
                } else if (rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move: " + opponentMove);

                //Print the results of the game
                if (myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if ((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }

            }

        }

        //Print a final message
        System.out.println("Thanks for playing Rock, Paper, Scissors!");

    }
}
