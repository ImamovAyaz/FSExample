import org.junit.jupiter.api.*;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    private final Calculator calculator = new Calculator();

    @Test
    void addTest() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void addToResult() {
        calculator.add(1, 1);
        assertEquals(5, calculator.addToResult(3));
    }
    @Test
    void subTest() {
        assertEquals(0, calculator.sub(1, 1));
    }

    @Test
    void subToResult() {
        calculator.sub(5, 1);
        assertEquals(1, calculator.subToResult(3));
    }

    @Test
    void mulTest() {
        assertEquals(20, calculator.mul(4, 5));
    }

    @Test
    void mulToResult() {
        calculator.mul(5, 2);
        assertEquals(30, calculator.mulToResult(3));
    }

    @Test
    void divTest() {
        assertEquals(5, calculator.div(10, 2));
    }

    @Test
    void divToResult() {
        calculator.div(30, 2);
        assertEquals(5, calculator.divToResult(3));
    }

    @Test()
    void divNegativeTest() {
        assertThrows(InvalidParameterException.class, () -> {
            calculator.div(10, 0);
        },"Было вызвано исключение InvalidParameterException");
    }

    @Test
    void powTest() {
        assertEquals(8, calculator.pow(2, 3));
    }

    @Test
    void powToResult() {
        calculator.pow(2, 2);
        assertEquals(16, calculator.powToResult(2));
    }
}
