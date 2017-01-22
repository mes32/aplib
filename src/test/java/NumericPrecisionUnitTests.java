import com.github.mes32.aplib.*;
import com.github.mes32.aplib.exception.*;
import org.junit.*;
import org.junit.Assert.*;

public class NumericPrecisionUnitTests {
    @Test
    public void testUnspecifiedPrecision() {
        NumericPrecision unspecified = new NumericPrecision();
        Assert.assertTrue(unspecified.isExact());
    }

    @Test
    public void testSpecifiedPrecision() throws InvalidNumericPrecisionException {
        int value = 5;
        NumericPrecision specified = new NumericPrecision(value);
        Assert.assertFalse(specified.isExact());
    }

    @Test
    public void testValue() throws InvalidNumericPrecisionException, NotApplicableNumericPrecisionException {
        int value = 5;
        NumericPrecision p = new NumericPrecision(value);
        Assert.assertEquals(value, p.getPrecision());
    }

    @Test (expected = InvalidNumericPrecisionException.class)
    public void testValueInvalidHigh() throws InvalidNumericPrecisionException {
        int value = Integer.MAX_VALUE;
        new NumericPrecision(value);
    }

    @Test (expected = InvalidNumericPrecisionException.class)
    public void testValueInvalidLow() throws InvalidNumericPrecisionException {
        int value = -99;
        new NumericPrecision(value);
    }

    @Test
    public void testPrintExact() {
        String printExact = "Exact";
        NumericPrecision p = new NumericPrecision();
        Assert.assertEquals(printExact, p.toString());
    }

    @Test
    public void testPrintValue() throws InvalidNumericPrecisionException {
        int value = 5;
        String stringValue = "5";
        NumericPrecision p = new NumericPrecision(value);
        Assert.assertEquals(stringValue, p.toString());
    }
}