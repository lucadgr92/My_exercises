import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();
    @Test
    void testintSum() {
        int result = testing.intSum(2,2);
        assertEquals(4,result);
    }

    @Test
    void testIntSumNegativeValues() {
        int result = testing.intSum(-2,-2);
        assertEquals(-4,result);
    }

    @Test
    void testIntSumNegativeAndPositiveValues() {
        int result = testing.intSum(+2,-2);
        assertEquals(0,result);
    }
}