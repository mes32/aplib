/*

    NumericPrecision.java - aplib

 */

package com.github.mes32.aplib;

class NumericPrecision {
    private static final int MAX_PRECISION = 100;  // Maybe too low
    private static final String PRINT_EXACT = "Exact";

    boolean isExact;
    int precision;

    NumericPrecision() {
        isExact = true;
    }

    APNumber(int precision) {
        isExact = false;
        this.precision = precision;
    }

    String toString() {
        if (isExact) {
            return PRINT_EXACT;
        } else {
            return precision;
        }
    }
}