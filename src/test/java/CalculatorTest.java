import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  public void testAdd() {
    assertEquals(5, calculator.add(2, 3));
    assertEquals(0, calculator.add(-5, 5));
    assertEquals(-10, calculator.add(-5, -5));
  }

  @Test
  public void testSubtract() {
    assertEquals(1, calculator.subtract(5, 4));
    assertEquals(-9, calculator.subtract(1, 10));
  }

  @Test
  public void testMultiply() {
    assertEquals(12, calculator.multiply(3, 4));
    assertEquals(0, calculator.multiply(0, 5));
    assertEquals(-15, calculator.multiply(3, -5));
  }

  @Test
  public void testDivide() {
    assertEquals(2.5, calculator.divide(5, 2), 0.001);
    assertEquals(-3.0, calculator.divide(-9, 3), 0.001);
  }

  @Test(expected = ArithmeticException.class)
  public void testDivideByZero() {
    calculator.divide(10, 0);
  }

  @Test
  public void testIsEven() {
    assertTrue(calculator.isEven(4));
    assertFalse(calculator.isEven(7));
    assertTrue(calculator.isEven(0));
  }
}