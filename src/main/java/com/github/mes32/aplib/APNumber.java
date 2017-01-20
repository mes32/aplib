/*

    APNumber - aplib

 */

package com.github.mes32.aplib;

class APNumber {
    //int base; Just assume base 10 for now
    NumericPrecision precision;
    int[] digits;
    int firstFractionalIndex;

    APNumber(String strValue) {

    }

    APNumber(String strValue, int precision) {

    }

    String toString() {
        return "0";
    }
}