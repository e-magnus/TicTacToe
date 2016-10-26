package is.ru.tictactoe;

import static spark.Spark.*;
 
public class TicTacToeWebUI {
	private static Board board;
	
    public static void setup() {
		board = new Board();
		
		staticFileLocation("/public");
        SparkApplication tttweb = new TicTacToeWebUI();
		
		String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }
		ticweb.init();
	}
	
	@Override
    public void init() {
        post("/Initialize", (req, res) -> {
            board.initializeBoard();
            return "";
        });
    }
}