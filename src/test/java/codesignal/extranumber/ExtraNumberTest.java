package codesignal.extranumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtraNumberTest {


    private ExtraNumber number;

    @Before
    public void setup() {
        number = new ExtraNumber();
    }

    @Test
    public void shouldReturnSeven() {
        int result = number.extraNumber(2, 7, 2);
        assertEquals(7, result);
    }

    @Test
    public void shouldReturnThree() {
        int result = number.extraNumber(3, 2, 2);
        assertEquals(3, result);
    }

    @Test
    public void shouldReturnOne() {
        int result = number.extraNumber(5, 5, 1);
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnThree2() {
        int result = number.extraNumber(500000000, 3, 500000000);
        assertEquals(3, result);
    }


}