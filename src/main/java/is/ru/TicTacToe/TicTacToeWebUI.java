package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWebUI implements SparkApplication {
	public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }

}