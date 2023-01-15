import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestCalculator {
    private final Calculator calculator = new Calculator();

    @Test
    void addTest(){
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    void addToResult(){
        calculator.add(1,1);
        assertEquals(5,calculator.addToResult(3));
    }

    @Test
    void addNegativeTest(){
        assertNotEquals(3, calculator.add(1,1));
    }

    @Test
//    @Tag("Негативыный тест")
    void subTest(){
        assertEquals(0, calculator.sub(1,1));
    }

    @Test
    void subToResult(){
        calculator.sub(5,1);
        assertEquals(1, calculator.subToResult(3));
    }

    @Test
    void subNegativeTest(){
        assertNotEquals(1, calculator.sub(1,1));
    }

    @Test
    void mulTest(){
        assertEquals(20, calculator.mul(4,5));
    }

    @Test
    void mulToResult(){
        calculator.mul(5,2);
        assertEquals(30, calculator.mulToResult(3));
    }

    @Test
    void mulNegativeTest(){
        assertNotEquals(25, calculator.mul(4,5));
    }

    @Test
    void divTest(){
        assertEquals(5, calculator.div(10,2));
    }

    @Test
    void divToResult(){
        calculator.div(30,2);
        assertEquals(5, calculator.divToResult(3));
    }

    @Test
    void divNegativeTest(){
        assertNotEquals(10, calculator.div(10,2));
    }

    @Test
    void powTest(){
        assertEquals(8, calculator.pow(2,3));
    }

    @Test
    void powToResult(){
        calculator.pow(2,2);
        assertEquals(16, calculator.powToResult(2));
    }

    @Test
    void powTNegativeTest(){
        assertNotEquals(22, calculator.pow(2,3));
    }
}
