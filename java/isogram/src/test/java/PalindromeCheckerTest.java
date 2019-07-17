import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckerTest {

    @Test
    public void testWord1(){
        PalindromeChecker pal = new PalindromeChecker();
        assertTrue(pal.IsPalidrome("happyppah"));
    }

    @Test
    public void testWord2(){
        PalindromeChecker pal = new PalindromeChecker();
        assertFalse(pal.IsPalidrome("rtyuia"));
    }
}
