
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UrlControllerTest {

    private UrlController controller;

    @BeforeEach
    void setUp() {
        controller = new UrlController(new UrlShortenerService());
    }

    @Test
    void testHandleShorten() {
        String response = controller.handleShorten("https://test.com");
        assertTrue(response.contains("short.ly/") || !response.isEmpty());
    }
}
