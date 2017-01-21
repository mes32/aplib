/*

    NumericPrecision.java - aplib

 */

package com.github.mes32.aplib;

class NumericPrecision {
    private static final int MAX_PRECISION = 100;  // Maybe too low
    private static final String PRINT_EXACT = "Exact";

    private boolean isExact;
    private int precision;

    NumericPrecision() {
        isExact = true;
    }

    NumericPrecision(int precision) {
        isExact = false;
        this.precision = precision;
    }

    public String toString() {
        if (isExact) {
            return PRINT_EXACT;
        } else {
            return Integer.toString(precision);
        }
    }
}