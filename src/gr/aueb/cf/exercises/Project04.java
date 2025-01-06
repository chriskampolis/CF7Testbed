package gr.aueb.cf.exercises;

import java.util.Scanner;

public class Project04 {

    public static void main(String[] args) {
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};  // Initialize the board with numbers 1-9
        char currentPlayer = 'X'; // Start with player X
        boolean gameEnded = false;
        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (!gameEnded) {
            printBoard(board);  // Print the current state of the board
            System.out.println("Player " + currentPlayer + "'s turn (" + currentPlayer + ")");

            // Player makes a move
            int move;
            while (true) {
                System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
                move = scanner.nextInt() - 1; // Adjust for 0-based index

                // Check if the move is valid
                if (move >= 0 && move < 9 && board[move] != 'X' && board[move] != 'O') {
                    board[move] = currentPlayer;  // Update the board with the current player's symbol
                    break;  // Valid move, exit loop
                } else {
                    System.out.println("Invalid move. The position is either out of range or already taken.");
                }
            }

            // Check for win or draw
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                gameEnded = true;
            } else {
                // Switch players if the game is running
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    // Print the board, including numbers for empty spots
    public static void printBoard(char[] board) {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("-----------");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("-----------");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
    }

    // Check if the game has ended (win or draw)
    public static boolean checkWin(char[] board, char currentPlayer) {
        // Winning combinations (indexes of board)
        int[][] winPatterns = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
                {0, 4, 8}, {2, 4, 6}  // Diagonals
        };

        for (int[] pattern : winPatterns) {
            if (board[pattern[0]] == currentPlayer && board[pattern[1]] == currentPlayer && board[pattern[2]] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    // Check if the board is full (draw)
    public static boolean isBoardFull(char[] board) {
        for (char cell : board) {
            if (cell != 'X' && cell != 'O') {
                return false; // If there's at least one empty spot
            }
        }
        return true;
    }
}