package is.ru.tictactoe;

import static spark.Spark.*;
 
public class HelloSpark {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello, World!");
    }
}