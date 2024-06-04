import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testMin() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(2, Main._min(numbers));
    }

    @Test
    public void testMax() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(4, Main._max(numbers));
    }

    @Test
    public void testSum() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(10, Main._sum(numbers));
    }

    @Test
    public void testMult() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(24, Main._mult(numbers));
    }
}
