package spark.examples.transformer;

import static spark.Spark.get;
import spark.Request;
import spark.Response;
import spark.Route;

public class TransformerExample {

    public static void main(String args[]) {
        get("/hello", "application/json", new Route() {
			@Override
			public Object handle(Request request, Response response) {
				return new MyMessage("Hello World");
			}
        }, new JsonTransformer());
    }

}
