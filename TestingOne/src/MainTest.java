import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testintSum() {
        assertEquals(4,Main.intSum(2,2));
    }

    @Test
    void testIntSumNegativeValues() {
        assertEquals(-4,Main.intSum(-2,-2));
    }

    @Test
    void testIntSumNegativeAndPositiveValues() {
        assertEquals(0,Main.intSum(-2,2));
    }


    @Test
    void testIntegerSum() {
        assertEquals(4,Main.integerSum(2,2));
    }

    @Test
    void testIntegerSumNegativeValues() {
        assertEquals(-4,Main.integerSum(-2,-2));
    }

    @Test
    void testIntegerSumNegativeAndPositiveValues() {
        assertEquals(0,Main.integerSum(2,-2));
    }

    @Test
    void testIntegerSumNullInputOne() {
        Integer nullValue = null;
        assertThrows(NullPointerException.class,
                () -> Main.integerSum(nullValue, 2));
    }


    @Test
    void testIntegerSumNullInputTwo() {
        Integer nullValue = null;
        assertThrows(NullPointerException.class,
                () -> Main.integerSum(2 , nullValue));
    }




}