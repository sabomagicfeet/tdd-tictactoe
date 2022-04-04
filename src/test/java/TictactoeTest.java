import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TictactoeTest {
    @Test
    void test1() {
        // Arrange
        Tictactoe tictactoe = new Tictactoe();

        char[][] expected = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        // act
        char[][] actual = tictactoe.getTictactoeBoard();

        // Arrange
        Assertions.assertArrayEquals(expected, actual);

    }
}
