package com.company;
import java.util.Arrays;
import java.util.List;

public class Bascket {
    private static String items = "";

    public static void main(String[] args) {
        add("bread",true);
        add("bread",33);
        add("bread",34);
        add("cola", 20.55);
        add("phone",12000);
        add("RAM",200);
        add("check", 2.8);
        add("jam", 44.99);
        print("All");
        clear();
        print("All");

    }
    public static void add(String name, boolean price){
        items = items + "\n" + "# " + name + " - " + price + " грн";
    }
    public static void add(String name, int price){
        items = items + "\n" + "# " + name + " - " + price + " грн";
    }
    public static void add(String name, double price){
        items = items + "\n" + "# " + name + " - " + price + " грн";
    }
    public static void clear(){
        items = "";
    }

    public static void print(String title){
        System.out.println("*** " + title + " ***" );
        if (items.isEmpty()){
            System.out.println("Пусто");
        }else System.out.println(items);
    }

    }