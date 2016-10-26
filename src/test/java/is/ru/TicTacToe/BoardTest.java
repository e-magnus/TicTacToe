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
    public void testPrintBoard() {
        Board b = new Board();
        assertEquals("   |   |   \n---+---+---\n   |   |   \n---+---+---\n   |   |   \n", b.printBoard());
    }
	
	@Test
    public void testPrintBoardAfterInsert() {
        Board b = new Board();
		Player p1 = new Player("Nick Young", "X");
        Player p2 = new Player("Nick Old", "O");
		b.insertSymbol(p1, 1);
		b.insertSymbol(p2, 2);
		b.insertSymbol(p1, 5);
		b.insertSymbol(p1, 4);
        assertEquals("   | X | O \n---+---+---\n   | X | X \n---+---+---\n   |   |   \n", b.printBoard());
    }
	
	
}
