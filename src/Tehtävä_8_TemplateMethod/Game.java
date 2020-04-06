package Tehtävä_8_TemplateMethod;

public abstract class Game {
    protected int playerCount;

    abstract void initializeGame();
    abstract void makePlay(int player);
    abstract boolean endOfGame();
    abstract void printWinner();

    public final void playOneGame(int playerCount) {
        this.playerCount = playerCount;
        initializeGame();
        int i = 0;
        while (!endOfGame()) {
            makePlay(i);
            i = (i + 1) % playerCount;
        }
        printWinner();
    }
}
