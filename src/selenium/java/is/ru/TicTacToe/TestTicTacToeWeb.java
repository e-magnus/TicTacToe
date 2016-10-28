package is.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTicTacToeWeb extends SeleniumTestWrapper {
    @Test
    public void titleMatches() {
        driver.get(baseUrl);
        assertEquals("TicTacToe Plan B", driver.getTitle());
    }
}
