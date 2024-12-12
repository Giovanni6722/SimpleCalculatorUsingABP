package tests;
import calculator.model.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testCalculatorGeneral()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0,.001);
        calculator.numberPressed(5);
        calculator.numberPressed(3);
        assertEquals(calculator.displayNumber(), 53.0, .001);
        calculator.addPressed();
        calculator.numberPressed(5);
        calculator.numberPressed(0);
        assertEquals(calculator.displayNumber(), 50.0, .001);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 103.0, .001);
        calculator.subtractPressed();
        calculator.numberPressed(3);
        assertEquals(calculator.displayNumber(),3.0,.001);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(),100,.001);
    }
    @Test
    public void testCalculatorDecimals()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(2);
        calculator.decimalPressed();
        calculator.numberPressed(5);
        calculator.decimalPressed();
        calculator.numberPressed(5);
        assertEquals(calculator.displayNumber(), 2.55, .001);
        calculator.addPressed();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(4);
        calculator.decimalPressed();
        calculator.numberPressed(5);
        assertEquals(calculator.displayNumber(), 4.5,.001);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(),7.05,.001);
    }
    @Test
    public void testDivState()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(10);
        calculator.dividePressed();
        calculator.numberPressed(5);
        calculator.equalsPressed();
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 0.4, .001);
    }
    @Test
    public void testSubState()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(10);
        calculator.subtractPressed();
        calculator.numberPressed(5);
        calculator.subtractPressed();
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 5.0, .001);
    }
    @Test
    public void testMultState()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(10);
        calculator.multiplyPressed();
        calculator.numberPressed(5);
        calculator.equalsPressed();
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 250.0, .001);
    }
    @Test
    public void testAddState()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(10);
        calculator.addPressed();
        calculator.numberPressed(5);
        calculator.equalsPressed();
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 20.0, .001);
    }

    @Test
    public void testAddDecimalState()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(5);
        calculator.decimalPressed();
        calculator.numberPressed(2);
        calculator.addPressed();
        calculator.numberPressed(2);
        calculator.decimalPressed();
        calculator.numberPressed(1);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 7.3, .001);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 9.4, .001);
    }

    @Test
    public void testSubDecimalState()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(5);
        calculator.decimalPressed();
        calculator.numberPressed(2);
        calculator.subtractPressed();
        calculator.numberPressed(2);
        calculator.decimalPressed();
        calculator.numberPressed(1);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 3.1, .001);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 1.0, .001);
    }

    @Test
    public void testMultDecimalState()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(5);
        calculator.decimalPressed();
        calculator.numberPressed(2);
        calculator.multiplyPressed();
        calculator.numberPressed(2);
        calculator.decimalPressed();
        calculator.numberPressed(1);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 10.92, .001);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 22.932, .001);
    }

    @Test
    public void testDivDecimalState()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(5);
        calculator.decimalPressed();
        calculator.numberPressed(2);
        calculator.dividePressed();
        calculator.numberPressed(2);
        calculator.decimalPressed();
        calculator.numberPressed(1);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 2.4761904761904763, .001);
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 1.1791383219954648, .001);
    }
    @Test
    public void testCalculatorClear()
    {
        Calculator calculator = new Calculator();
        assertEquals(calculator.displayNumber(), 0.0, .001);
        calculator.numberPressed(6);
        assertEquals(calculator.displayNumber(), 6.0, .001);
        calculator.clearPressed();
        assertEquals(calculator.displayNumber(), 0.0, .001);
    }

}
