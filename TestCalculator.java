import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    private final Calculator calculator = new Calculator();

    @Test
    void addTest(){
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    void addToResult(){
        calculator.add(1,1);
        assertEquals(5,calculator.add(3));
    }

    @Test
    void subTest(){
        assertEquals(0, calculator.sub(1,1));
    }

    @Test
    void subToResult(){
        calculator.sub(5,1);
        assertEquals(1, calculator.sub(3));
    }

    @Test
    void mulTest(){
        assertEquals(20, calculator.mul(4,5));
    }

    @Test
    void mulToResult(){
        calculator.mul(5,2);
        assertEquals(30, calculator.mul(3));
    }

    @Test
    void divTest(){
        // TODO: Add reading input data for test from file
        assertEquals(5, calculator.div(10,2));
    }

    @Test
    void divToResult(){
        calculator.div(30,2);
        assertEquals(5, calculator.div(3));
    }

    @Test
    void powTest(){
        // TODO: Add reading input data for test from file
        assertEquals(8, calculator.pow(2,3));
    }

    @Test
    void powToResult(){
        calculator.pow(2,2);
        assertEquals(16, calculator.pow(2));
    }
}
