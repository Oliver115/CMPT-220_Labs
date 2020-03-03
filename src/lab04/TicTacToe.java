// CMPT220
// Oliver Wilson

package lab04;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        String[][] board = new String[3][3];

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = " ";
            }
        }

        // Initialize player.
        int player = 1;

        // Main game loop:
        while (Boolean.parseBoolean(doesWinnerExists(board)[1])) {

            boolean flag = true;
            while (flag) {
                // Display game state.
                printBoard(board);

                int[] coordinates = getPlayerMove(player);
                int row = coordinates[0];
                int column = coordinates[1];

                // Mark the specified space.
                if (markBoard(board, row, column, player)) {
                    flag = false;
                }
            }
            // Switch player for next turn.
            player = (player % 2) + 1;
        }
            printBoard(board);
            printFinalMessage(Integer.parseInt(doesWinnerExists(board)[0]));
    }

    private static String[] doesWinnerExists(String[][] board) {
        String[] returnWinner = new String[2];
        returnWinner[1] = "true";
        returnWinner[0] = " ";

        if (checkRows(board, "X") || checkColumns(board, "X") || checkDiagonals(board, "X")) {
            returnWinner[0] = "1";
            returnWinner[1] = "false";
        }
        else if (checkRows(board, "O") || checkColumns(board, "O") || checkDiagonals(board, "O")) {
            returnWinner[0] = "2";
            returnWinner[1] = "false";
        }
        else if (slotsAvailable(board) < 1) {
            returnWinner[0] = "0";
            returnWinner[1] = "false";
        }
        else {
            returnWinner[1] = "true";
        }
        return returnWinner;
    }

    private static int slotsAvailable(String[][] board) {
        int slotsAvailable = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    slotsAvailable++;
                }
            }
        }
        return slotsAvailable;
    }

    private static boolean checkRows(String[][] board, String playerSign) {
        boolean doesWinnerExists = false;
        int counter = 0;

        // Check winner in rows
        for (int row = 0; row < 3; row++) {
            if (counter < 3) {
                counter = 0;
                for (int column = 0; column < 3; column++) {
                    if (board[row][column].equals(playerSign))
                        counter++;
                }
            }
        }
        if (counter == 3)
            doesWinnerExists = true;

        return doesWinnerExists;
    }

    private static boolean checkColumns(String[][] board, String playerSign) {
        boolean doesWinnerExist = false;
        int counter = 0;

        // Check winner in columns
        for (int column = 0; column < 3; column++) {
            if (counter < 3) {
                counter = 0;
                for (int row = 0; row < 3; row++) {
                    if (board[row][column].equals(playerSign))
                        counter++;
                }
            }
        }
        if (counter == 3) {
            doesWinnerExist = true;
        }
        return doesWinnerExist;
    }

    private static boolean checkDiagonals(String[][] board, String playerSign) {
        boolean doesWinnerExist = false;

            if (board[0][0].equals(playerSign) && board[1][1].equals(playerSign) && board[2][2].equals(playerSign)) {
                doesWinnerExist = true;
            }
            else if (board[0][2].equals(playerSign) && board[1][1].equals(playerSign) && board[2][0].equals(playerSign)) {
                doesWinnerExist = true;
            }
        return doesWinnerExist;
    }

    private static void printBoard(String[][] board) {
        System.out.println("+---+---+---+");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n+---+---+---+");
        }
    }

    private static int[] getPlayerMove(int player) {
        Scanner input = new Scanner(System.in);
        int[] playerCoordinates = new int[2];
        boolean flag = true;

        while (flag) {
            System.out.print("Player " + player + "\n> Enter row: ");
            playerCoordinates[0] = input.nextInt();

            System.out.print("> Enter column: ");
            playerCoordinates[1] = input.nextInt();

            if (playerCoordinates[0] > 3 || playerCoordinates[1] > 3) {
                System.out.println("Value out of range! Enter row and column again!\n");
                continue;
            }
            flag = false;
        }
        return playerCoordinates;
    }

    private static boolean markBoard(String[][] board, int row, int column, int player) {
        String originalPlayerSign;
        String oppositePlayerSign;
        if (player == 1) {
            originalPlayerSign = "X";
            oppositePlayerSign = "O";
        }
        else {
            originalPlayerSign = "O";
            oppositePlayerSign = "X";
        }

        boolean isSlotFree = true;
        if (board[row][column].equals(oppositePlayerSign)) { // PlayerSign is the problem
            System.out.println("Slot is already taken. Please choose a different slot!\n");
            isSlotFree = false;
        }
        else {
            board[row][column] = originalPlayerSign;
        }
        return isSlotFree;
    }

    private static void printFinalMessage(int winner) {

        switch (winner) {
            case 0: System.out.println("The Game is Even Steven!");
                break;
            case 1: System.out.println("Player 1 Wins!");
                break;
            case 2: System.out.println("Player 2 Wins!");
                break;
            default: System.out.println("Ups! Something went wrong!");
        }
    }
}
