
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionsTest {

    @Test
    public void testDividersNumber() {
        Functions functions = new Functions();
        assertEquals(4, functions.dividersNumber(6));
        assertEquals(2, functions.dividersNumber(7));
        assertEquals(1, functions.dividersNumber(1));
    }

    @Test
    public void testMaxOfThree() {
        Functions functions = new Functions();
        assertEquals(10, functions.maxOfThree(3, 10, 7));
        assertEquals(20, functions.maxOfThree(20, 5, 1));
        assertEquals(0, functions.maxOfThree(-5, -10, 0));
    }

    @Test
    public void testFizzBuzz() {
        Functions functions = new Functions();
        assertEquals("FizzBuzz", functions.fizzBuzz(15));
        assertEquals("Fizz", functions.fizzBuzz(9));
        assertEquals("Buzz", functions.fizzBuzz(10));
        assertEquals(7, functions.fizzBuzz(7));
    }

    @Test
    public void testIsVowel() {
        Functions functions = new Functions();
        assertTrue(functions.isVowel('a'));
        assertTrue(functions.isVowel('E'));
        assertFalse(functions.isVowel('z'));
        assertFalse(functions.isVowel('1'));
    }
}
