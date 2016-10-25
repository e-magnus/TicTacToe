package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWebUI implements SparkApplication {
	private final ResourceToInject resourceToInject;

    public HelloWorldApp(ResourceToInject resourceToInject) {
        this.resourceToInject = resourceToInject;
    }

    @Override
    public void init() {
        get("/", (req, res) -> resouceToInject::sayHello);
    }

}