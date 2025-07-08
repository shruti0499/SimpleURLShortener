import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class UrlController implements HttpHandler {
    private final UrlService urlService = new UrlService();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            Map<String, String> formData = Utils.parseFormData(exchange);
            String originalUrl = formData.get("url");
            String shortUrl = urlService.shortenUrl(originalUrl);
            String response = "Shortened URL: http://localhost:8000/" + shortUrl;
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
