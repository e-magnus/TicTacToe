package is.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
 
public class TicTacToeWebUI implements SparkApplication {
	private static Board board;
	private static Player p1, p2, curr;
	
    public static void main(String[] args) {
		board = new Board();
        p1 = new Player("Test1", "X");
        p2 = new Player("Test2", "O");
        curr = p1;
		
		staticFileLocation("/public");
        SparkApplication webUI = new TicTacToeWebUI();
		
		String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }
		webUI.init();
	}
	
	@Override
    public void init() {
        get("/currentPlayer", (req, res) -> curr.getSymbol());
    }
}
