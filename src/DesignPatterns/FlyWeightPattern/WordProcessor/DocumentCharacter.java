package DesignPatterns.FlyWeightPattern.WordProcessor;

public class DocumentCharacter implements ILetter {
    private char character;
    private String fontType;
    private int fontSize;

    DocumentCharacter(char character, String fontType, int fontSize) {
        this.character = character;
        this.fontType = fontType;
        this.fontSize = fontSize;
    }

    // only getters for intrinsic properties

    @Override
    public void display(int row, int column) {
        //display the character of particular font and size at the given location
    }
}
