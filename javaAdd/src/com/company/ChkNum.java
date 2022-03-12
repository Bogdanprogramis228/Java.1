package com.company;

public class ChkNum {
    boolean isEvent(int x) {
        if ((x % 2) == 0) {
            return true;
        } else return false;
    }

    boolean isFactor(int а, int b) {
        if ((b % а) == 0) return true;
        else return false;
    }
}
