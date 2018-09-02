import java.util.concurrent.atomic.AtomicInteger;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();
        AtomicInteger j = new AtomicInteger();

        get("/hello", (req, res) -> "###Hello World### count:" + (i.incrementAndGet()) + "\n");

        get("/1", (req, res) -> "#Hello World1 count:" + (j.incrementAndGet()) + "\n");
    }
}