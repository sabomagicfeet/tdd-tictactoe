import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TictactoeTest {
    @Test
    void getInitializedBoardTest() {
        // Arrange
        Tictactoe tictactoe = new Tictactoe();

        char[][] expected = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        // act
        char[][] actual = tictactoe.getGameBoard();

        // Arrange
        Assertions.assertArrayEquals(expected, actual);

    }
}
