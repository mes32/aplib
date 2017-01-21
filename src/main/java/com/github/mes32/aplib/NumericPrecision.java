/*

    NumericPrecision.java - aplib

 */

package com.github.mes32.aplib;

public class NumericPrecision {
    private static final int MAX_PRECISION = 100;  // Maybe too low
    private static final String PRINT_EXACT = "Exact";

    private boolean isExact;
    private int precision;

    public NumericPrecision() {
        isExact = true;
    }

    public NumericPrecision(int precision) {
        isExact = false;
        this.precision = precision;
    }

    public boolean isExact() {
        return isExact;
    }

    public int getPrecision() {
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