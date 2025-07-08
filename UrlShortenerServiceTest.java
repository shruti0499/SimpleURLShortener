
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UrlShortenerServiceTest {

    @Test
    void testShortenUrl() {
        UrlShortenerService service = new UrlShortenerService();
        String shortUrl = service.shortenUrl("https://example.com");
        assertNotNull(shortUrl);
    }

    @Test
    void testGetOriginalUrl() {
        UrlShortenerService service = new UrlShortenerService();
        String original = "https://example.com";
        String shortUrl = service.shortenUrl(original);
        String restored = service.getOriginalUrl(shortUrl);
        assertEquals(original, restored);
    }

    @Test
    void testUnknownShortUrl() {
        UrlShortenerService service = new UrlShortenerService();
        assertNull(service.getOriginalUrl("nonexistent123"));
    }
}
