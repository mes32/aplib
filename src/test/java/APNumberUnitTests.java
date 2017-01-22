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
        //Assert.assertTrue(unspecified.isExact());
    }
}