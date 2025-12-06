package LLDExamples.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("The winner is: " + game.startGame());
    }
}
