/*

    APNumberUnitTests.java - aplib

 */

import com.github.mes32.aplib.*;
import com.github.mes32.aplib.exception.*;
import org.junit.*;
import org.junit.Assert.*;

public class APNumberUnitTests {
    @Test
    public void testConstructorExact() throws APNumberParseException {
        String inputString = "5";
        new APNumber(inputString);
    }

    @Test (expected = APNumberParseException.class)
    public void testConstructorExactException1() throws APNumberParseException {
        String inputString = "1234.ABCD";
        new APNumber(inputString);
    }

    @Test (expected = APNumberParseException.class)
    public void testConstructorExactException2() throws APNumberParseException {
        String inputString = "111.222.333";
        new APNumber(inputString);
    }

    @Test (expected = APNumberParseException.class)
    public void testConstructorExactException3() throws APNumberParseException {
        String inputString = "00.5";
        new APNumber(inputString);
    }

    @Test (expected = APNumberParseException.class)
    public void testConstructorExactException4() throws APNumberParseException {
        String inputString = "";
        new APNumber(inputString);
    }
}