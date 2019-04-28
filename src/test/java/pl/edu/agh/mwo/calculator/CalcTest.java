package pl.edu.agh.mwo.calculator;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalcTest
{

    Calculator calc = new Calculator();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdding()
    {
        Assert.assertEquals(3, calc.add(1,2));
        Assert.assertEquals(0, calc.add(10,-10));
        Assert.assertEquals(100, calc.add(0,100));
        Assert.assertEquals(100000000, calc.add(100000001,-1));
        Assert.assertEquals(0.5, calc.add(1,-0.5));
        Assert.assertEquals(1.5, calc.add(1,0.5));
    }

    @Test
    public void testSubtract()
    {
        Assert.assertEquals(-1, calc.subtract(1,2));
        Assert.assertEquals(20, calc.subtract(10,-10));
        Assert.assertEquals(-100, calc.subtract(0,100));
        Assert.assertEquals(100000002, calc.subtract(100000001,-1));
        Assert.assertEquals(1.5, calc.subtract(1,-0.5));
        Assert.assertEquals(0.5, calc.subtract(1,0.5));
    }

    @Test
    public void testMultiply()
    {
        Assert.assertEquals(2, calc.multiply(1,2));
        Assert.assertEquals(-100, calc.multiply(10,-10));
        Assert.assertEquals(0, calc.multiply(0,100));
        Assert.assertEquals(-100000001, calc.multiply(100000001,-1));
        Assert.assertEquals(-0.5, calc.multiply(1,-0.5));
        Assert.assertEquals(0.5, calc.multiply(1,0.5));
    }

    @Test
    public void testDivide()
    {
        Assert.assertEquals(2, calc.divide(4,2));
        Assert.assertEquals(1, calc.divide(10,10));
    }
    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivideByZero()
    {
        calc.divide(1,0);
    }



}
