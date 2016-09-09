import static.Spark.*;

public class App {
  pubic static void main(String[] args) {
    get("/hello", (request,response) -> "Hello Friend!");
  }
}
  
