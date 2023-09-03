// Add Unit Tests for Calculator.java
// Path: assignment-java-calculator/CalculatorTest.java
// Compare this snippet from assignment-java-calculator/Calculator.java:

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Test class
public class CalculatorTest() {
    @Test
    public void testAdd() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Calculator.subtract(4, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, Calculator.multiply(2, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(4, 2));
    }

    // Add more tests here
    @Test
    public void testAddNegative() {
        assertEquals(-4, Calculator.add(-2, -2));
    }

    @Test   
    public void testSubtractNegative() {
        assertEquals(-2, Calculator.subtract(-4, -2));
    }

    // Test Calculator.calculate()
    @Test
    public void testCalculateAdd() {
        assertEquals(4, Calculator.calculate(2, 2, '+'));
    }
    @Test
    public void testCalculateSubtract() {
        assertEquals(2, Calculator.calculate(4, 2, '-'));
    }
}