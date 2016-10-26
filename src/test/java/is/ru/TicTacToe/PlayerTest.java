package is.ru.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {
	@Test 
	public void testConstructor() {
		Player p = new Player("Svanur", "X");
		assertEquals("Svanur", p.getNickname());
		assertEquals("X", p.getSymbol());
	}
}
