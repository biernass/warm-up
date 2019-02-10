package codesignal.arithmeticexpression;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticExpressionTest {

    ArithmeticExpression expression;

    @Before
    public void setup() {
        expression = new ArithmeticExpression();
    }

    @Test
    public void shouldReturnTrueTest1() {
        boolean result = expression.arithmeticExpression(2, 3, 5);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnTrueTest2() {
        boolean result = expression.arithmeticExpression(8, 2, 4);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseTest3() {
        boolean result = expression.arithmeticExpression(8, 3, 2);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnTrueTest4() {
        boolean result = expression.arithmeticExpression(6, 3, 3);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnTrueTest5() {
        boolean result = expression.arithmeticExpression(18, 2, 9);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnTrueTest6() {
        boolean result = expression.arithmeticExpression(2, 3, 6);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseTest7() {
        boolean result = expression.arithmeticExpression(5, 2, 0);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseTest8() {
        boolean result = expression.arithmeticExpression(10, 2, 2);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseTest9() {
        boolean result = expression.arithmeticExpression(5, 2, 2);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseTest10() {
        boolean result = expression.arithmeticExpression(1, 2, 1);
        assertEquals(false, result);
    }


}