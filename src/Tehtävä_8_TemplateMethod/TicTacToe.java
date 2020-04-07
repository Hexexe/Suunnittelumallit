package Tehtävä_8_TemplateMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TicTacToe extends Game {

    public static Scanner s = new Scanner(System.in);
    private Map<Integer, Object> map = new HashMap<>();
    private int currentPlayer;

    @Override
    void initializeGame() {
        for (int i = 1; i < 10; i++) { map.put(i, "_"); }
        printBoard();
    }

    @Override
    void makePlay(int player) {
        currentPlayer = player;
        System.out.printf("\nPlayer %d choose your grid number (1-9): ", player + 1);
        boolean validMove = false;
        while (!validMove) {
            try {
                String ss = s.next();
                while (!(map.get(Integer.parseInt(ss)).equals("_") && ss.matches("[1-9]"))) {
                    System.out.println("Invalid Input");
                    ss = s.next();
                }
                checkInput(Integer.parseInt(ss), player);
                validMove = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    @Override
    boolean endOfGame() { return checkWinner() || !map.containsValue("_"); }

    @Override
    void printWinner() {
        if (!checkWinner()) System.out.println("Draw");
        else System.out.printf("Player %d won the game", currentPlayer + 1);
    }

    public void printBoard() {
        map.entrySet().forEach(e -> { System.out.print(" | " + e.getValue());
        if (IntStream.of(3, 6, 9).anyMatch(i -> i == e.getKey())) System.out.println(" | "); });
    }

    public void checkInput(int i, int player) {
        String s = (player == 0) ? "X" : "O";
        map.replace(i, s);
        printBoard();
    }

    private boolean checkWinner() {
        //horizontal
        if (map.get(1) == map.get(2) && map.get(2) == map.get(3) && map.get(1) != "_") return true;
        if (map.get(4) == map.get(5) && map.get(5) == map.get(6) && map.get(4) != "_") return true;
        if (map.get(7) == map.get(8) && map.get(8) == map.get(9) && map.get(7) != "_") return true;
        //vertical
        if (map.get(1) == map.get(4) && map.get(4) == map.get(7) && map.get(1) != "_") return true;
        if (map.get(2) == map.get(5) && map.get(5) == map.get(8) && map.get(2) != "_") return true;
        if (map.get(3) == map.get(6) && map.get(6) == map.get(9) && map.get(3) != "_") return true;
        //diagonal
        if (map.get(1) == map.get(5) && map.get(5) == map.get(9) && map.get(1) != "_") return true;
        if (map.get(3) == map.get(5) && map.get(5) == map.get(7) && map.get(3) != "_") return true;
        return false;
    }
}