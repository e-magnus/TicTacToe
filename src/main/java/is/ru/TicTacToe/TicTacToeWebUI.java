package is.ru.tictactoe;

import static spark.Spark.*;
 
public class TicTacToeWebUI {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello, World!");
    }
}