package is.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
 
public class TicTacToeWebUI implements SparkApplication {
	//private static Board board;
	
    public static void main(String[] args) {
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
        final Chuck chuck = new Chuck();    
        post("/random", (req, res) -> chuck.random());
        post("/id", (req, res) -> chuck.getById(req.queryParams("id")));
        post("/setName", (req, res) -> {
            chuck.alterName(
                req.queryParams("firstName"),
                req.queryParams("lastName")
            );          
            res.status(200);
            return res;
        });
    }
}