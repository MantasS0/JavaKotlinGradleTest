package lt.bta.test;

import lt.bta.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestMain {

    @Test
    public void testCalculator() {
        Main main = new Main();
        assertEquals(4.0, main.calculator("+", 2, 2));
        assertEquals(0.0, main.calculator("-", 2, 2));
        assertEquals(10.0, main.calculator("*", 2, 5));
        assertEquals(4.0, main.calculator("/", 8, 2));
        assertEquals(8.0, main.calculator("**", 2, 3));
//        assertEquals(new ArithmeticException("Unknown operation"), main.calculator("^", 2, 3));
        assertThrows(ArithmeticException.class, () -> {
            main.calculator("^", 2, 3);
        });
    }

    @Test
    public void testCalculatorNull() {
        Main main = new Main();
        assertThrows(NullPointerException.class, () -> {
            main.calculator(null, 2, 2);
        });

    }
}
