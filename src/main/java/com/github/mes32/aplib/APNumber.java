/*

    APNumber.java - aplib

 */

package com.github.mes32.aplib;

import com.github.mes32.aplib.exception.*;
import java.util.*;

public class APNumber {
    //private int base; Just assume base 10 for now
    private NumericPrecision precision;
    private List<Integer> digits;
    private int firstFractionalIndex;

    public APNumber(String strValue) throws APNumberParseException {
        precision = new NumericPrecision();

        String[] strArray = strValue.split("");
        boolean foundFractionalPoint = false;
        for (String token : strArray) {
            if (token.equals(".")) {
                if (foundFractionalPoint) {
                    String message = "Invalid input string.";
                    throw new APNumberParseException(message);
                } else {
                    foundFractionalPoint = true;
                    // set firstFractionalIndex
                }
            } else {
                try {
                    Integer digit = new Integer(token);
                } catch (NumberFormatException e) {
                    String message = "APNumber could not parse token '" + token + "' as Integer.";
                    throw new APNumberParseException(message, e);
                }
            }
        }
    }

    public APNumber(String strValue, int precision) throws APNumberParseException, InvalidNumericPrecisionException {
        this.precision = new NumericPrecision(precision);

    }

    public String toString() {
        return "0";
    }
}