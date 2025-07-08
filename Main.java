import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/shorten", new UrlController());
        server.createContext("/login", new AuthController());
        server.setExecutor(null);
        server.start();
        System.out.println("Server started on port 8000");
    }
}
