package com.company;

public class Retmath extends Vehicle{
    public static void main(String[] args){
        Vehicle miniven = new Vehicle();
        Vehicle sportcar = new Vehicle();

        double gallons;

        int range1, range2, speed1, speed2, dist = 252;

        miniven.passengers = 7;
        miniven.fuelcap = 16;
        miniven.mgp = 21;
        miniven.time = 7;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mgp = 12;
        sportcar.time = 7;

        miniven.km = range1 = miniven.range(); // Присваиваемо значения, возвращ методом
        sportcar.km = range2 = sportcar.range();

        speed1 = miniven.speed();
        speed2 = sportcar.speed();

        gallons = miniven.fullneaded(dist);

        System.out.println("Для подолання " + dist + " км. Використовується мінівеном " + gallons + " галон пального");
        System.out.println("");
        gallons = sportcar.fullneaded(dist);
        System.out.println("Для подолання " + dist + " км. Використовується спорткаром " + gallons + " галон пального");
        System.out.println("");
        System.out.println("Мінівен може перевести людей кількістю " + miniven.passengers + " осіб. На відстані " + range1 + " миль.\n" + "Зі швидкістю " + miniven.speed() + " км/год за " + miniven.time + " год.");
        System.out.println("");
        System.out.println("Спорткар може перевести людей кількістю " + sportcar.passengers + " осіб. На відстані " + range2 + " миль.\n" + "Зі швидкістю " + sportcar.speed() + " км/год за " + sportcar.time + " год.");
    }
}
