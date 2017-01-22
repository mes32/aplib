/*

    NumericPrecision.java - aplib

 */

package com.github.mes32.aplib;

import com.github.mes32.aplib.exception.*;

public class NumericPrecision {
    private static final int MAX_PRECISION = 100;  // Maybe too low
    private static final String PRINT_EXACT = "Exact";

    private boolean isExact;
    private int precision;

    public NumericPrecision() {
        isExact = true;
    }

    public NumericPrecision(int precision) throws InvalidNumericPrecisionException {
        if (precision < 0) {
            String message = "Negative numeric precision disallowed.";
            throw new InvalidNumericPrecisionException(message);
        } else if (precision > MAX_PRECISION) {
            String message = "Numeric precision exceeds maximum allowable.";
            throw new InvalidNumericPrecisionException(message);
        }
        isExact = false;
        this.precision = precision;
    }

    public boolean isExact() {
        return isExact;
    }

    public int getPrecision() throws NotApplicableNumericPrecisionException {
        if (isExact) {
            String message = "Exact value implies precision is not applicable.";
            throw new NotApplicableNumericPrecisionException(message);
        }
        return precision;
    }

    public String toString() {
        if (isExact) {
            return PRINT_EXACT;
        } else {
            return Integer.toString(precision);
        }
    }
}