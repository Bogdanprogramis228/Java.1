package com.company;

public class ParmDemo extends ChkNum {
    public static void main(String[] args){
        ChkNum e = new ChkNum();

        if(e.isEvent(10)) System.out.println("10 - парне число!");
        if(e.isEvent(7)) System.out.println("7 - парне число!");
        if(e.isEvent(8)) System.out.println("8 - парне число!");
        if(e.isEvent(40)) System.out.println("40 - парне число!");
        if(e.isFactor(2, 20)) System.out.println("20 - парне число!");
        if(e.isFactor(2, 30)) System.out.println("30 - парне число!");
    }
}
