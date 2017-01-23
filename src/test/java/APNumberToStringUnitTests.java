/*

    APNumberToStringUnitTests.java - aplib

 */

import com.github.mes32.aplib.*;
import com.github.mes32.aplib.exception.*;
import org.junit.*;
import org.junit.Assert.*;

public class APNumberToStringUnitTests {
    @Test
    public void testToString1() throws APNumberParseException {
        String inputString = "5";
        APNumber num = new APNumber(inputString);
        Assert.assertEquals(inputString, num.toString());
    }

    @Test
    public void testToString2() throws APNumberParseException {
        String inputString = "5.001";
        APNumber num = new APNumber(inputString);
        Assert.assertEquals(inputString, num.toString());
    }

    @Test
    public void testToString3() throws APNumberParseException {
        String inputString = "5.";
        String outputString = "5";
        APNumber num = new APNumber(inputString);
        Assert.assertEquals(outputString, num.toString());
    }

    /*@Test
    public void testToString4() throws APNumberParseException {
        String inputString = "5.000";
        String outputString = "5";
        APNumber num = new APNumber(inputString);
        Assert.assertEquals(outputString, num.toString());
    }*/
}