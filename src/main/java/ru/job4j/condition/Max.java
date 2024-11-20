package ru.job4j.condition;

public class Max {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static String labelYesNo(boolean yes) {
        return yes ? "Yes" : "No";
    }

    public int max(int first, int second, int third) {
        return Math.max(Math.max(first, second), third);
    }

    public int max(int first, int second, int third, int fourth) {
        return Math.max(Math.max(first, second), Math.max(third, fourth));
    }

    public static void main(String[] args) {
        boolean positive = isPositive(10);
        String label = labelYesNo(positive);
        System.out.println("Is 10 positive number? " + label);
    }
}
