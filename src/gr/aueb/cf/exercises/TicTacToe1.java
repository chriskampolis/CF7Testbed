package gr.aueb.cf.exercises;

import java.util.Scanner;

public class TicTacToe1 {
    public static char[][] board = new char[3][3]; // 3x3 Tic-Tac-Toe board
    public static char currentPlayer = 'X'; // Player 'X' starts the game

    public static void main(String[] args) {
        boardReset(); // Initialize the board to empty
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard(); // Print the current game board
            System.out.println("Player " + currentPlayer + ", enter your move (row and column) separated by space (0-2): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid input. Please enter row and column values between 0 and 2.");
                continue;
            }

            if (board[row][col] != ' ') {
                System.out.println("This position is already taken. Please try again!");
                continue;
            }

            // Make the move
            board[row][col] = currentPlayer;

            // Check if the current player wins after the move
            if (checkWinner(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            // Check for draw (if the board is full and no winner)
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Switch player after each turn
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }
    }

    // Initialize the game board with empty spaces
    public static void boardReset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
            // Arrays.fill(board[i], ' ');
        }
    }

    // Print the current board state
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check if the current player has won the game
    public static boolean checkWinner(char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            // Check row
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            // Check column
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    // Check if the board is full (draw scenario)
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // There's an empty space
                }
            }
        }
        return true; // No empty spaces, it's a draw
    }
}

