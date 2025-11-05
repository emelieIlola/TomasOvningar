package ovningVecka5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DivisionTest {

    @Test
    public void testAvDivision() {
        int[] inputArr = {10,2};
        assertEquals(5,Division.division(10,2));
    }
}
