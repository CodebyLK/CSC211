package homework5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SimpleProgramTest {

    @Test
    @DisplayName("Test for array equality")
    void arrayTest() {
        int[] evenArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        assertArrayEquals(evenArray, SimpleProgram.arrayEvens()); 
    }
    
    @Test
    @DisplayName("Test for square equality/inequality")
    void numSquareTest() {
        assertEquals(9.0, SimpleProgram.numSquare(3));
        assertNotEquals(15.0, SimpleProgram.numSquare(4));
    }
}
