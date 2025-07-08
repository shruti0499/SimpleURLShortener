import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UrlService {
    private final Map<String, String> db = new HashMap<>();

    public String shortenUrl(String originalUrl) {
        String key = UUID.randomUUID().toString().substring(0, 6);
        db.put(key, originalUrl);
        return key;
    }
}
