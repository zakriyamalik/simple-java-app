// File: test/XYClassTest.java
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class XYClassTest {

    @Test
    public void testAddNumbers() {
        XYClass xy = new XYClass();
        int result = xy.addNumbers(2, 3);
        assertEquals(String.valueOf(5), result, "2 + 3 should equal 5");
    }

    @Test
    public void testGreet() {
        XYClass xy = new XYClass();
        String result = xy.greet("John");
        assertEquals("Hello, John!", result, "Greeting should be 'Hello, John!'");
    }

    @Test
    public void testSubtractNumbers() {
        XYClass xy = new XYClass();
        int result = xy.subtractNumbers(5, 3);
        assertEquals(String.valueOf(2), result, "5 - 3 should equal 2");
    }
}
