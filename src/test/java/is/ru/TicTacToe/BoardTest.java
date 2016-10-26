package is.ru.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {
	@Test
	public void testForValidInput()
	{
		Board b = new board();
		b.isValidMove(0);
		b.isValidMove(8);
	}
}
