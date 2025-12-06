package LLDExamples.TicTacToe;

import LLDExamples.TicTacToe.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Board gameboard;
    Deque<Player> players;

    public void initializeGame() {
        players = new LinkedList<>();

        PlayingPieceX playingPieceX = new PlayingPieceX();
        Player player1 = new Player(playingPieceX, "Player 1");

        PlayingPieceO playingPieceO = new PlayingPieceO();
        Player player2 = new Player(playingPieceO, "Player 2");

        players.add(player1);
        players.add(player2);

        gameboard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();

            gameboard.printBoard();
            List<List<Integer>> freeSpaces = gameboard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.println("Player " + playerTurn.name + ", Enter row, column where you want to place your piece.");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int row = Integer.valueOf(values[0]);
            int column = Integer.valueOf(values[1]);

            boolean pieceAdded = gameboard.addPiece(row, column, playerTurn.playingPiece);
            if (!pieceAdded) {
                System.out.println("Incorrect position chosen, try again.");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            boolean winner = isThereWinner(row, column, playerTurn.playingPiece.pieceType);
            if(winner) {
                return playerTurn.name;
            }
        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for (int i = 0; i < gameboard.size; i++) {
            if (gameboard.board[row][i] == null || gameboard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        for (int i = 0; i < gameboard.size; i++) {

            if (gameboard.board[i][col] == null || gameboard.board[i][col].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        for (int i = 0, j = 0; i < gameboard.size; i++, j++) {
            if (gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        for (int i = 0, j = gameboard.size - 1; i < gameboard.size; i++, j--) {
            if (gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
