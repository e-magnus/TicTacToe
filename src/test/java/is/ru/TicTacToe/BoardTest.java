package is.ru.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {
	@Test
	public void testForValidInput()
	{
		Board b = new Board();
		b.isValidMove(0);
		b.isValidMove(3);
		b.isValidMove(8);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
    public void testInputTooLow() {
        Board b = new Board();
        b.isValidMove(-1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testInputTooHigh() {
        Board b = new Board();
        b.isValidMove(9);
    }
	
	@Test
    public void testToString() {
        Board b = new Board();
        assertEquals("   |   |   \n---+---+---\n   |   |   \n---+---+---\n   |   |   \n", b.printBoard());
    }
}
