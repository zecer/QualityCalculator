package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;
    CalculationsVerbalizer calculationsVerbalizerTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Before
    public void setUp2() {
        calculationsVerbalizerTest = new CalculationsVerbalizer();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }

    @Test
    public void testSub() throws Exception {
        assertEquals(1, calculationsUnderTest.calculate(Operation.SUBTRACT, 4, 3), 0.01);
    }

    @Test
    public void testDiv() throws Exception {
        assertEquals(2, calculationsUnderTest.calculate(Operation.DIVIDE, 4, 2), 0.01);
    }

    @Test
    public void testMul() throws Exception {
        assertEquals(8, calculationsUnderTest.calculate(Operation.MULTIPLY, 4, 2), 0.01);
    }


    @Test
    public void testDiff2() throws Exception {
        assertEquals(Float.POSITIVE_INFINITY, calculationsUnderTest.calculate(Operation.DIVIDE, 4, 0), 0.01);
    }

    @Test
    public void testDiff3() throws Exception {
        assertEquals(Float.NEGATIVE_INFINITY, calculationsUnderTest.calculate(Operation.DIVIDE, -5, 0), 0.01);
    }

    @Test
    public void testDiff4() throws Exception {
       assertEquals("3.0 plus 3.0 gives value 6.0", calculationsVerbalizerTest.verbalize(Operation.SUM, 3,3, 6));
    }


}
