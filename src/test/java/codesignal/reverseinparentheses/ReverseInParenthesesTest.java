package codesignal.reverseinparentheses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseInParenthesesTest {

    private ReverseInParentheses reverse;

    @Before
    public void setup(){
         reverse = new ReverseInParentheses();
    }

    @Test
    public void shouldReverseWholeString() {
        String result = reverse.reverseInParentheses("(bar)");
        assertEquals("rab", result);
    }

    @Test
    public void shouldReturnfoorabbaz(){
        assertEquals("foorabbaz", reverse.reverseInParentheses("foo(bar)baz"));
    }

    @Test
    public void shouldReturnfoorabbazmilb(){
        assertEquals("foorabbazmilb", reverse.reverseInParentheses("foo(bar)baz(blim)"));
    }

     @Test
    public void shouldReturnfoobazrabblim(){
        assertEquals("foobazrabblim", reverse.reverseInParentheses("foo(bar(baz))blim"));
    }




}