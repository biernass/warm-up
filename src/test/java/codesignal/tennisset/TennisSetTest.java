package codesignal.tennisset;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TennisSetTest {

    private TennisSet tennisSet;

    @Before
    public void setup() {
        tennisSet = new TennisSet();
    }

    @Test
    public void shouldReturnTrueTest1() {
        boolean result = tennisSet.tennisSet(3, 6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseTest2() {
        boolean result = tennisSet.tennisSet(8, 5);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseTest3() {
        boolean result = tennisSet.tennisSet(6, 5);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseTest4() {
        boolean result = tennisSet.tennisSet(7, 7);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueTest5() {
        boolean result = tennisSet.tennisSet(6, 4);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueTest6() {
        boolean result = tennisSet.tennisSet(7, 5);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseTest7() {
        boolean result = tennisSet.tennisSet(7, 2);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueTest8() {
        boolean result = tennisSet.tennisSet(7, 6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseTest9() {
        boolean result = tennisSet.tennisSet(4, 10);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseTest10() {
        boolean result = tennisSet.tennisSet(0, 0);
        assertFalse(result);
    }


}