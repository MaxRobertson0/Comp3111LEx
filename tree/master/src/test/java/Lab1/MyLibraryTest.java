package Lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyLibraryTest {

    @Test
    public void testPower() {
        assertEquals(128, MyLibrary.Power(2,7));
        assertNotEquals(255, MyLibrary.Power(2,8));
    }
    @Test
    public void testFactorial(){
        assertEquals(1, MyLibrary.factorial(1));
        assertEquals(6, MyLibrary.factorial(3));
        assertNotEquals(9, MyLibrary.factorial(4));
    }
}
