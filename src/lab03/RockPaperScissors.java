// CMPT230
// Oliver Wilson

package lab03;
import java.util.Scanner;

public class RockPaperScissors {
    /**
     * main method to test implementation for the convert method
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        // Prints the description of the program to the user
        System.out.println("Welcome to a Rock, Paper, Scissors game\nPlease enter the amount of games you wish to play.");
        System.out.print("\nAmount of games to be played: "); // User enters amount of games to be played
        int amountOfGames = input.nextInt(); // Amount of games to be played. Designated by the user.

        int counter = 0; // Counts the amount of games
        int userScore = 0; // Keeps track of user score
        int computerScore = 0; // Keeps track of computer score

        while (counter < amountOfGames) {

            String[] moves = {"rock", "paper", "scissors"}; // Possible moves
            String randomNumber = moves[(int)(Math.random() * 3)]; // Gets a random move from the array of moves

            System.out.print("\nEnter move: "); // Prompts user enters move
            String userMove = input.next(); // User's move
            userMove = userMove.toLowerCase(); // Make sure user's move is all in lowercase letters

            // Checks if user move is a valid input
            if ((!userMove.equals(moves[0]) && !userMove.equals(moves[1])) && !userMove.equals(moves[2])) {
                System.out.println("Incorrect Input!\nPlease try again!");
            }
            else
                // If user input is valid. Prints results
                System.out.println("Computer entered: " + randomNumber +
                        "\nResult: " + calculateWinner(userMove, randomNumber));

            counter += 1; // Adds 'one' to the count.

            if (calculateWinner(userMove, randomNumber).equals("point awarded to user"))
                userScore++; // If user wins, a point is added to the user's total score
            else if (calculateWinner(userMove, randomNumber).equals("point awarded to computer"))
                computerScore++; // If computer wins, a point is added to the computer's total score
            }

        if (userScore > computerScore)
            System.out.println("====================================\n" +
                    "**END RESULTS**\nUser: " + userScore + "\nComputer: " + computerScore +"\nYOU WIN! THE GAME!!");
        else if (userScore < computerScore)
            System.out.println("====================================\n" +
                    "**END RESULTS**\nUser: " + userScore + "\nComputer: " + computerScore + "\nYOU LOSE!! COMPUTER WINS!!");
        else
            System.out.println("====================================\n" +
                    "**END RESULTS**\nUser: " + userScore + "\nComputer: " + computerScore + "\nDRAW!!");
    }

    public static String calculateWinner (String userChoice, String randomChoice) {
        /**
         * This method calculates the result for a rock, paper, scissors game,
         * It takes two parameters, then compares both and returns the outcome.
         *
         * @param userChoice = The choice made by the user.
         * @param randomChoice = The choice of the computer made at random.
         *
         * @return String, stating Win, Draw, or Lose.
         */
        // Cases for user to win
        if (userChoice.equals("rock") && randomChoice.equals("scissors"))
            return "point awarded to user";

        else if (userChoice.equals("paper") && randomChoice.equals("rock"))
            return "point awarded to user";

        else if (userChoice.equals("scissors") && randomChoice.equals("paper"))
            return "point awarded to user";

        // Cases for user to draw
        else if (userChoice.equals("rock") && randomChoice.equals("rock"))
            return "draw";

        else if (userChoice.equals("paper") && randomChoice.equals("paper"))
            return "draw";

        else if (userChoice.equals("scissors") && randomChoice.equals("scissors"))
            return "draw";

        // Cases for user to lose
        else if (userChoice.equals("rock") && randomChoice.equals("paper"))
            return "point awarded to computer";

        else if (userChoice.equals("paper") && randomChoice.equals("scissors"))
            return "point awarded to computer";

        else if (userChoice.equals("scissors") && randomChoice.equals("rock"))
            return "point awarded to computer";

        // In case of error, program will print the following
        else
            return "ERROR! Please try again!";
    }
}


