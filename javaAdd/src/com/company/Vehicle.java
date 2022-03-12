package com.company;

public class Vehicle {
    int passengers;      // количество ссажиров
    int fuelcap;        // емкость топливного бака
    int mgp;        // потребление топлива в милях на галлон
    int km;
    int time;

    int range() {
        return fuelcap * mgp; // Возврат дальности поездки для заданного транспортного средсва
    }

    int speed() {
        return km / time;
    }

    double fullneaded(int miles){       // miles == dist
        return (double) miles / mgp;
    }
}