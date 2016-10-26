package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
 
public class TicTacToeWebUI implements SparkApplication {
	//private static Board board;
	
    public static void setup() {
		//board = new Board();
		
		staticFileLocation("/public");
        SparkApplication ticweb = new TicTacToeWebUI();
		
		String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }
		ticweb.init();
	}
	
	@Override
    public void init() {
        post("/Initialize", (req, res) -> {
            //board.initializeBoard();
            return ""; 
        });
        get("/currentPlayer", (req, res) -> 'X');
    }
}
