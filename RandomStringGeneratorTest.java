
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomStringGeneratorTest {

    @Test
    void testGeneratedLength() {
        String str = RandomStringGenerator.generate(8);
        assertEquals(8, str.length());
    }

    @Test
    void testGeneratedNotNull() {
        String str = RandomStringGenerator.generate(10);
        assertNotNull(str);
    }

    @Test
    void testUniqueness() {
        String one = RandomStringGenerator.generate(6);
        String two = RandomStringGenerator.generate(6);
        assertNotEquals(one, two);
    }
}
