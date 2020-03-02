// CMPT220
// Oliver Wilson

package lab04;
import java.util.Scanner;

public class TicTacToe {

    /** Create Scanner class to read input from user. */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] board = new String[3][3]; // TODO: replace this with a 3x3 2-dimensional array. Initialize all values with 0.

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = " ";
            }
        }

        // Initialize player.
        int player = 1;

        // Main game loop:
        while (hasBlanks(board)) {

            // Display game state.
            printBoard(board);

            // Get player move.
            int[] coordinates = getPlayerMove(player);
            int row = coordinates[0];
            int column = coordinates[1];

            // Mark the specified space.
            markBoard(board, row, column, player);

            // Switch player for next turn.
            player = (player % 2) + 1;
        }
    }

    private static boolean hasBlanks(String[][] board) { /* TODO: develop method which checks for blanks. */
        boolean flag = false;
        int thereIsAWinner = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((board[i][j].equals(board[i][j])) && (board[i][j].equals(board[i][j])));
                thereIsAWinner = 1;
            }
        }

        if





        int spaceAvailable = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    spaceAvailable++;
                }
            }
            if (spaceAvailable > 0)
                flag = true;
        }
        return flag;
    }

    private static void printBoard(String[][] board) { /* TODO: develop method which prints game board. */
        System.out.println("+---+---+---+");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n+---+---+---+");
        }
    }

    private static int[] getPlayerMove(int player) { /* TODO: develop method which returns player move. */
        Scanner input = new Scanner(System.in);

        int[] playerCoordinates = new int[2];

        do {
            System.out.print("\nPlayer " + player + " Enter row between (0 - 2): ");
            playerCoordinates[0] = input.nextInt();

            System.out.print("Player " + player + " Enter column between (0 - 2): ");
            playerCoordinates[1] = input.nextInt();
        }
        while (playerCoordinates[0] > 3 && playerCoordinates[1] > 3);

        return playerCoordinates;
    }

    private static void markBoard(String[][] board, int row, int column, int player) {
        /* TODO: develop method which updates the game with the player number. */

        String playerSign = "";
        if (player == 1) {
            playerSign = "X";
        }
        else {
            playerSign = "O";
        }

        if (board[row][column].equals(" ")) {
            board[row][column] = playerSign;
        }
        else {
            System.out.println("Slot unavailable. Please choose a different slot! ");
        }
    }
}
