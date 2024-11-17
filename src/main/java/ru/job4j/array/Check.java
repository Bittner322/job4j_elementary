package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean dataElement : data) {
            boolean prime = data[0];
            if (dataElement != prime) {
                result = false;
                break;
            }
        }
        return result;
    }
}
