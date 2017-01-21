/*

    APNumber - aplib

 */

package com.github.mes32.aplib;

class APNumber {
    //private int base; Just assume base 10 for now
    private NumericPrecision precision;
    private int[] digits;
    private int firstFractionalIndex;

    APNumber(String strValue) {

    }

    APNumber(String strValue, int precision) {

    }

    public String toString() {
        return "0";
    }
}