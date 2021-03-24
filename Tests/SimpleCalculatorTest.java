import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add() {
        int a = 10;
        int b = 5;
        int result = SimpleCalculator.add(a,b);
        assertEquals(15, result);
    }

    @Test
    void subtract() {
        int a = 1;
        int b = -1;
        int result = SimpleCalculator.subtract(a,b);
        assertEquals(2, result);
    }

    @Test
    void multiply() {
        int a = 0;
        int b = 100;
        int result = SimpleCalculator.multiply(a,b);
        assertEquals(0, result);
    }

    @Test
    void divide() {
        int a = 10;
        int b = 1;
        int result = SimpleCalculator.divide(a,b);
        assertEquals(10, result);
    }

    @Test
    void testAdd() {
        float a = 3.53f;
        float b = 2.14f;
        float result = SimpleCalculator.add(a,b);
        assertEquals(5.670000076293945, result);

    }

    @Test
    void testSubtract() {
        float a = 1.15f;
        float b = 1.250f;
        float result = SimpleCalculator.subtract(a,b);
        assertEquals(-0.10000002384185791, result);
    }

    @Test
    void testMultiply() {
        float a = 0.85f;
        float b = 100f;
        float result = SimpleCalculator.multiply(a,b);
        assertEquals(85, result);
    }

    @Test
    void testDivide() {
        float a = 175f;
        float b = 12.2f;
        float result = SimpleCalculator.divide(a,b);
        assertEquals(14.34426212310791, result);
    }
}