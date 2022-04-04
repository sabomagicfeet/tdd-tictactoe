public class Tictactoe {
    private char[][] gameBoard;

    public Tictactoe() {
        this.gameBoard = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
    }

    public char[][] getGameBoard() {
        return gameBoard;
    }
}
