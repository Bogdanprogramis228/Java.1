package com.company;

class Pwq{
    double b;
    double val;
    int e;

    Pwq(double base, int exp) {
        b = base;
        e = exp;
        val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) val = val * base;
    }

    double get_pwq() {
        return val;
    }
}