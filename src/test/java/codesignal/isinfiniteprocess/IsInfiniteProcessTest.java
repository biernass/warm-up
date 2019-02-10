package codesignal.isinfiniteprocess;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsInfiniteProcessTest {

    IsInfiniteProcess process;

    @Before
    public void setup() {
        process = new IsInfiniteProcess();
    }

    @Test
    public void shouldReturnFalseTest1() {
        boolean result = process.isInfiniteProcess(2, 6);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnTrueTest2() {
        boolean result = process.isInfiniteProcess(2, 3);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseTest3() {
        boolean result = process.isInfiniteProcess(2, 10);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnTrueTest4() {
        boolean result = process.isInfiniteProcess(0, 1);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnTrueTest5() {
        boolean result = process.isInfiniteProcess(3, 1);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseTest6() {
        boolean result = process.isInfiniteProcess(10, 10);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnTrueTest7() {
        boolean result = process.isInfiniteProcess(5, 10);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseTest8() {
        boolean result = process.isInfiniteProcess(6, 10);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnTrueTest9() {
        boolean result = process.isInfiniteProcess(10, 0);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseTest10() {
        boolean result = process.isInfiniteProcess(5, 5);
        assertEquals(false, result);
    }

}