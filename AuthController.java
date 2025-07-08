import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

public class AuthController implements HttpHandler {

    
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "User login simulated (authentication logic to be implemented).";
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
