import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTests {
    @Test
    @Order(2)
    void testSecond() {
        assertEquals(4, 2 * 2);
    }

    @Test
    @Order(1)
    void testFirst() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Order(3)
    void testThird() {
        assertEquals(1, 5 - 4);
    }
}
