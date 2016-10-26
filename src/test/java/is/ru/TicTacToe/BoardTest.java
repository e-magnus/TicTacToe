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
    public void testInputTooLow()
	{
        Board b = new Board();
        b.isValidMove(-1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testInputTooHigh()
	{
        Board b = new Board();
        b.isValidMove(9);
    }
	
	@Test
    public void testPrintBoard()
	{
        Board b = new Board();
        assertEquals("   |   |   \n---+---+---\n   |   |   \n---+---+---\n   |   |   \n", b.printBoard());
    }
	
	@Test
    public void testPrintBoardAfterInsert()
	{
        Board b = new Board();
		Player p1 = new Player("Nick Young", "X");
        Player p2 = new Player("Nick Old", "O");
		b.insertSymbol(p1, 1);
		b.insertSymbol(p2, 2);
		b.insertSymbol(p1, 5);
		b.insertSymbol(p1, 4);
        assertEquals("   | X | O \n---+---+---\n   | X | X \n---+---+---\n   |   |   \n", b.printBoard());
    }
	
	@Test
	public void testIsEmpty()
	{
		Board b = new Board();
        Player p1 = new Player("Nick Yound", "X");
        Player p2 = new Player("Nick Old", "O");
		b.insertSymbol(p1, 1);
		b.insertSymbol(p2, 2);
		b.insertSymbol(p1, 5);
		b.insertSymbol(p1, 4);
		assertEquals(true, b.isEmpty(0));
		assertEquals(false, b.isEmpty(5));
		assertEquals(true, b.isEmpty(6));
		assertEquals(false, b.isEmpty(1));
	}
	
	public void testForWinner ()
	{
		Board b = new Board();
		Player p = new Player("Nick Young", "X");
		assertEquals(false, b.isWinner(p));
		
		/*test horizontal*/
		b.insertSymbol(p, 1);
		b.insertSymbol(p, 2);
		assertEquals(false, b.isWinner(p));
		b.insertSymbol(p, 0);
		assertEquals(true, b.isWinner(p));
		
		b.clearBoard();
		
		/*test vertical*/
		b.insertSymbol(p, 1);
		b.insertSymbol(p, 4);
		assertEquals(false, b.isWinner(p));
		b.insertSymbol(p, 7);
		assertEquals(true, b.isWinner(p));
		
		b.clearBoard();
		
		/*test diagonal*/
		b.insertSymbol(p, 0);
		b.insertSymbol(p, 4);
		assertEquals(false, b.isWinner(p));
		b.insertSymbol(p, 8);
		assertEquals(true, b.isWinner(p));
	}
	
	@Test
	public void testIsDraw()
	{
		Board b = new Board();
		Player p = new Player("Nick Young", "X");
		for(int i = 0; i < 8; i++)
		{
			b.insertSymbol(p, i);
		}
		assertEquals(false, b.isDraw());
		b.insertSymbol(p, 8);
		assertEquals(true, b.isDraw());
	}
}
