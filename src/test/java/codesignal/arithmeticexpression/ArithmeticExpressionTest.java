package codesignal.arithmeticexpression;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticExpressionTest {

   private ArithmeticExpression expression;

    @Before
    public void setup() {
        expression = new ArithmeticExpression();
    }

    @Test
    public void shouldReturnTrueTest1() {
        boolean result = expression.arithmeticExpression(2, 3, 5);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueTest2() {
        boolean result = expression.arithmeticExpression(8, 2, 4);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseTest3() {
        boolean result = expression.arithmeticExpression(8, 3, 2);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueTest4() {
        boolean result = expression.arithmeticExpression(6, 3, 3);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueTest5() {
        boolean result = expression.arithmeticExpression(18, 2, 9);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueTest6() {
        boolean result = expression.arithmeticExpression(2, 3, 6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseTest7() {
        boolean result = expression.arithmeticExpression(5, 2, 0);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseTest8() {
        boolean result = expression.arithmeticExpression(10, 2, 2);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseTest9() {
        boolean result = expression.arithmeticExpression(5, 2, 2);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseTest10() {
        boolean result = expression.arithmeticExpression(1, 2, 1);
        assertFalse(result);
    }


}