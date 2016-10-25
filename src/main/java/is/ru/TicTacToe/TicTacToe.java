package is.ru.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToe implements SparkApplication {
	public static void main(String[] args) {
        	get("/hello", (req, res) -> "Hello World");
    	}
}

