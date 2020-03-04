// CMPT220
// Oliver Wilson

package lab04;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] board = new String[3][3]; // Create array 3x3 2 dimensional array.

        // Every position in the array is replaced with a blank space " ".
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = " ";
            }
        }

        // Initialize player. (Player 1 always starts first)
        int player = 1;

        // Main game loop:
        // If a winner exists the main game loop ends, if not the loop continues.
        while (Boolean.parseBoolean(isThereFreeSlots(board)[1])) {
            boolean flag = true; // Controlling value.
            while (flag) { // If player selects a slot that is blank, the loop continues.
                // Display game state.
                printBoard(board); // Prints game board with player's moves.

                int[] coordinates = getPlayerMove(player); // Gets players move.
                int row = coordinates[0]; // Players row choice.
                int column = coordinates[1]; // Players column choice.

                // Mark the specified space.
                if (markBoard(board, row, column, player)) { // If the selected slot is NOT already taken.
                    flag = false; // Allows while loop to end.
                }
            }
            // Switch player for next turn.
            player = (player % 2) + 1;
        }
            printBoard(board); // Prints game board when the game has ended.
            printFinalMessage(Integer.parseInt(isThereFreeSlots(board)[0])); // Prints the results of the game.
    }

    /**
     * Method that checks if a winner exists by checking every row, column, and diagonal.
     * @param board = current game board.
     * @return an array of size 2 that contains if winner exists in [1] and what player won or if a draw exists in [0].
     */
    private static String[] isThereFreeSlots(String[][] board) {
        String[] returnWinner = new String[2]; // Create new array that holds if a player won, if so, whom.
        returnWinner[1] = "true"; // Initial value is 'true' because there are slots available.
        returnWinner[0] = " "; // Initial value is blank because no one has won yet.

        // Checks if player 1 has won.
        if (checkRows(board, "X") || checkColumns(board, "X") || checkDiagonals(board, "X")) {
            returnWinner[0] = "1"; // player 1 won the game.
            returnWinner[1] = "false"; // There are no more spaces available because a player has won the game.
        }
        // Checks if player 2 has won.
        else if (checkRows(board, "O") || checkColumns(board, "O") || checkDiagonals(board, "O")) {
            returnWinner[0] = "2"; // player 2 won the game.
            returnWinner[1] = "false"; // There are no more spaces available because a player has won the game.
        }
        // Game is a Draw.
        else if (checkIfSlotsAvailable(board) < 1) { // If there are no more slots available and no player has won. The game is a draw.
            returnWinner[0] = "0"; // No player has won. Value is assigned '0'.
            returnWinner[1] = "false"; // There are no more slots available.
        }
        else {
            returnWinner[1] = "true"; // No winner, but there are still slots available.
        }
        return returnWinner; // Returns which player won game or if a draw exists.
    }

    /**
     * Method that checks if any blank slots exist in game board.
     * @param board = current game board.
     * @return how many current slots are free or available.
     */
    private static int checkIfSlotsAvailable(String[][] board) {
        int slotsAvailable = 0; // Counter value that counts amount of free slots.
        // Checks every slot to see if it is available.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    slotsAvailable++; // If a slot is available the 'counter values' goes up by 1.
                }
            }
        }
        return slotsAvailable; // Returns amount of free slots.
    }

    /**
     * Method that checks every row for winner.
     * @param board = current game board.
     * @param playerSign = String sign that is used to identify player.
     * @return Boolean value that describes if winner was found in rows.
     */
    private static boolean checkRows(String[][] board, String playerSign) {
        boolean doesWinnerExists = false; // before method checks for winner, no winner exists.
        int counter = 0; // counter value.

        // Check winner in rows
        for (int row = 0; row < 3; row++) { // Checks the next row.
            if (counter < 3) { // if 3 slots in the same row match. A winner exists.
                counter = 0; // Counter is set back to '0' because no winner was found in the previous row.
                for (int column = 0; column < 3; column++) { // Checks every column in the row 'row'.
                    if (board[row][column].equals(playerSign)) // If a slot matches player's sign counter goes up by 1.
                        counter++;
                }
            }
        }
        if (counter == 3) // A winner exists.
            doesWinnerExists = true; // Winner exists, boolean value is changed to 'true'.

        return doesWinnerExists; // Return if player won the game or not.
    }

    /**
     * Method that checks every column for winner.
     * @param board = current game board.
     * @param playerSign = String sign that is used to identify player.
     * @return Boolean value that describes if winner was found in columns.
     */
    private static boolean checkColumns(String[][] board, String playerSign) {
        boolean doesWinnerExist = false; // before method checks for winner, no winner exists.
        int counter = 0; // counter value.

        // Check winner in columns
        for (int column = 0; column < 3; column++) { // Checks the next column.
            if (counter < 3) { // if 3 slots in the same column match. A winner exists.
                counter = 0; // Counter is set back to '0' because no winner was found in the previous column.
                for (int row = 0; row < 3; row++) { // Checks every row in the column 'column'.
                    if (board[row][column].equals(playerSign)) // If a slot matches player's sign counter goes up by 1.
                        counter++;
                }
            }
        }
        if (counter == 3) { // A winner exists.
            doesWinnerExist = true; // Winner exists, boolean value is changed to 'true'.
        }
        return doesWinnerExist; // Return if player won the game or not.
    }

    /**
     * Method that checks every valid diagonal for winner.
     * @param board = current game board.
     * @param playerSign = String sign that is used to identify player.
     * @return Boolean value that describes if winner was found in diagonals.
     */
    private static boolean checkDiagonals(String[][] board, String playerSign) {
        boolean doesWinnerExist = false; // before method checks for winner, no winner exists.

            // Check for winner in diagonals
            if (board[0][0].equals(playerSign) && board[1][1].equals(playerSign) && board[2][2].equals(playerSign)) {
                doesWinnerExist = true; // If all slots match, winner exists.
            }
            else if (board[0][2].equals(playerSign) && board[1][1].equals(playerSign) && board[2][0].equals(playerSign)) {
                doesWinnerExist = true; // If all slots match, winner exists.
            }
        return doesWinnerExist; // Returns if player exists or not.
    }

    /**
     * Method that prints the current game board
     * @param board = current game board.
     */
    private static void printBoard(String[][] board) {
        // Prints game board.
        System.out.println("+---+---+---+"); // Prints top border of the game board.
        for (int i = 0; i < 3; i++) { // Starts a new row.
            System.out.print("| "); // Prints first lef border of each row.
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | "); // Prints 3 slots.
            }
            System.out.println("\n+---+---+---+"); // Prints bottom border of the game board.
        }
    }

    /**
     * Method that allows the players to selected row and column to place next move.
     * @param player = Which player is selecting slot.
     * @return Player's selected row and column.
     */
    private static int[] getPlayerMove(int player) {
        // Gets players move.
        Scanner input = new Scanner(System.in); // Create scanner.
        int[] playerCoordinates = new int[2]; // Create an array to hold the 'row' and 'column' selection from the player.
        boolean flag = true; // Control value.

        while (flag) {
            System.out.print("Player " + player + "\n> Enter row: ");
            playerCoordinates[0] = input.nextInt();

            System.out.print("> Enter column: ");
            playerCoordinates[1] = input.nextInt();

            // Check if player entered valid input.
            // If player entered invalid input, make player select again.
            if (playerCoordinates[0] > 3 || playerCoordinates[1] > 3) {
                System.out.println("Value out of range! Enter row and column again!\n");
                continue;
            }
            flag = false; // Player has chosen valid input.
        }
        return playerCoordinates; // Return player's 'row' and 'column' selections.
    }

    /**
     * Method that marks the current game board based on the player and what row and column they selected.
     * @param board = current game board.
     * @param row = player's row selection.
     * @param column = player's column selection.
     * @param player = what player is marking the board.
     * @return Boolean value that describes player's selected slot is already taken or not.
     */
    private static boolean markBoard(String[][] board, int row, int column, int player) {
        String originalPlayerSign; // Player's turn sign.
        String oppositePlayerSign; // Opposite player's sign.
        if (player == 1) { // If the player is player 1.
            originalPlayerSign = "X";
            oppositePlayerSign = "O";
        }
        else { // If the player is player two.
            originalPlayerSign = "O";
            oppositePlayerSign = "X";
        }

        boolean isSlotFree = true; // Checks if player's selected slot is available.
        if (board[row][column].equals(oppositePlayerSign)) { // If slot is already taken.
            System.out.println("Slot is already taken.\nPlease look closely at the board and choose a different slot!\n");
            isSlotFree = false; // The slot is already taken.
        }
        else {
            // If slot is NOT taken. Player's slot choice is entered in desired slot
            board[row][column] = originalPlayerSign;
        }
        return isSlotFree; // Return if the selected slot was taken or not.
    }

    /** Method that prints welcome message */
    private static void printWelcomeMessage() {
        System.out.println();

    }

    /**
     * Method that prints results.
     * @param winner = Which player is selecting slot.
     */
    private static void printFinalMessage(int winner) {
        // Print result message.
        switch (winner) { // Who won the game.
            case 0: System.out.println("The Game is Even Steven!"); // The game was a draw.
                break;
            case 1: System.out.println("Player 1 Wins!"); // Player 1 wins/
                break;
            case 2: System.out.println("Player 2 Wins!"); // Player 2 wins
                break;
            default: System.out.println("Ups! Something went wrong!"); // default statement.
        }
    }
}
