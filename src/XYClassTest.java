// File: test/XYClassTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class XYClassTest {

    @Test
    public void testAddNumbers() {
        XYClass xy = new XYClass();
        int result = xy.addNumbers(2, 3);
        assertEquals(5, result);  // Corrected to use JUnit 5 assertion
    }

    @Test
    public void testGreet() {
        XYClass xy = new XYClass();
        String result = xy.greet("John");
        assertEquals("Hello, John!", result, "Greeting should be 'Hello, John!'");  // Corrected assertion
    }

    @Test
    public void testSubtractNumbers() {
        XYClass xy = new XYClass();
        int result = xy.subtractNumbers(5, 3);
        assertEquals(2, result);  // Corrected to use JUnit 5 assertion
    }

    public static void main(String[] args) {
        XYClassTest xyClassTest=new XYClassTest();
        xyClassTest.testAddNumbers();
    }
}
