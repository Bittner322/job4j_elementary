package ru.job4j;

public class Converter {
    public static double rubleToEuro(double value) {
        // Assuming the conversion rate is 1 Euro = 90 Rubles
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        // Assuming the conversion rate is 1 Dollar = 75 Rubles
        return value / 60;
    }
}
