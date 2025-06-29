import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    // Create a calculator object to test
    Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        // Test: 2 + 3 should equal 5
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void testSubtract() {
        // Test: 10 - 4 should equal 6
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
    
    @Test
    public void testMultiply() {
        // Test: 3 * 4 should equal 12
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }
    
    @Test
    public void testIsPositive() {
        // Test: 5 is positive (should return true)
        boolean result = calculator.isPositive(5);
        assertTrue(result);
        
        // Test: -3 is not positive (should return false)
        boolean result2 = calculator.isPositive(-3);
        assertFalse(result2);
    }
}