package com.company;

public class DemoPwq extends Pwq{
    DemoPwq(double base, int exp) {
        super(base, exp);
    }

    public static void main(String[] arqs){

        Pwq x = new Pwq(4.0,2);
        Pwq y = new Pwq(2.5,4);
        Pwq z = new Pwq(5.7,0);

        System.out.println(x.b + " в степени " + x.e +
                " равно " + x.get_pwq());
        System.out.println(y.b + " в степени " + y.e +
                " равно " + y.get_pwq());
        System.out.println(z.b + " в степени " + z.e +
                " равно " + z.get_pwq());
    }
}
