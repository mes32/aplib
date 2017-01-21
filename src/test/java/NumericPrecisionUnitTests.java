import com.github.mes32.aplib.*;
import org.junit.*;
import org.junit.Assert.*;

public class NumericPrecisionUnitTests {
    @Test
    public void testUnspecifiedPrecision() {
        NumericPrecision unspecified = new NumericPrecision();
        Assert.assertTrue(unspecified.isExact());
    }

    @Test
    public void testSpecifiedPrecision() {
        NumericPrecision specified = new NumericPrecision(5);
        Assert.assertFalse(specified.isExact());
    }

    @Test
    public void testValue() {
        int value = 5;
        NumericPrecision p = new NumericPrecision(value);
        Assert.assertEquals(value, p.getPrecision());
    }

    @Test
    public void testPrintExact() {
        String printExact = "Exact";
        NumericPrecision p = new NumericPrecision();
        Assert.assertEquals(printExact, p.toString());
    }

    @Test
    public void testPrintValue() {
        int value = 5;
        String stringValue = "5";
        NumericPrecision p = new NumericPrecision(value);
        Assert.assertEquals(stringValue, p.toString());
    }
}