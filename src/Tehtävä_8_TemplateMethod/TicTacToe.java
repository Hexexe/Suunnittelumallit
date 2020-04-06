package Tehtävä_8_TemplateMethod;

import java.util.Scanner;

public class TicTacToe extends Game {

    private String[][] board = new String[3][3];
    public static Scanner s = new Scanner(System.in);
    private int currentPlayer;

    @Override
    void initializeGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "_";
            }
        }
        printBoard();
    }

    @Override
    void makePlay(int player) {
        currentPlayer = player;
        System.out.printf("\nPlayer %d Choose coordinates (1-9): ", player + 1);
        while (!s.hasNext("[1-9]")) {
            System.out.println("Try again");
            s.next();
        }
        checkInput(s.nextInt(), player);
    }


    @Override
    boolean endOfGame() {
        return checkWinner();
    }

    @Override
    void printWinner() {
        System.out.printf("Pelaaja %d voitti pelin", currentPlayer + 1);
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0) System.out.print(" | ");
                System.out.print(board[i][j] + " | ");
            }
        }
    }


    public void checkInput(int i, int player) {

        String s = (player == 0) ? "X" : "O";

        switch (i) {
            case 1:
                board[0][0] = s;
                break;
            case 2:
                board[0][1] = s;
                break;
            case 3:
                board[0][2] = s;
                break;
            case 4:
                board[1][0] = s;
                break;
            case 5:
                board[1][1] = s;
                break;
            case 6:
                board[1][2] = s;
                break;
            case 7:
                board[2][0] = s;
                break;
            case 8:
                board[2][1] = s;
                break;
            case 9:
                board[2][2] = s;
                break;
            default:
                break;
        }
        printBoard();
    }

    private boolean checkWinner() {
        //rivi
        for (int i = 0; i < 3; i++) { if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != "_") return true; }
        //sarake
        for (int j = 0; j < 3; j++) { if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != "_") return true; }
        // vaaka
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != "_") return true;
        // full
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != "_") return true;

        return false;
    }
}
