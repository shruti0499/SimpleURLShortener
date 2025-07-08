import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    public static Map<String, String> parseFormData(HttpExchange exchange) throws IOException {
        InputStream is = exchange.getRequestBody();
        StringBuilder sb = new StringBuilder();
        int i;
        while ((i = is.read()) != -1) {
            sb.append((char) i);
        }
        String[] pairs = sb.toString().split("&");
        Map<String, String> formData = new HashMap<>();
        for (String pair : pairs) {
            String[] parts = pair.split("=");
            if (parts.length == 2) {
                formData.put(
                    URLDecoder.decode(parts[0], StandardCharsets.UTF_8),
                    URLDecoder.decode(parts[1], StandardCharsets.UTF_8)
                );
            }
        }
        return formData;
    }
}
