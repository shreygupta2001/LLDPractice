package LLDExamples.TicTacToe.Model;

public class Player {
    public String name;
    public PlayingPiece playingPiece;

    public Player(PlayingPiece playingPiece, String name) {
        this.playingPiece = playingPiece;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
}
