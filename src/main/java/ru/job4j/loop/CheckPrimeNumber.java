package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int hold = 0;
        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                hold++;
            }
            if (hold > 2) {
                break;
            }
        }
        return hold <= 2;
    }

    public static void main(String[] args) {
        System.out.println(check(6));
        System.out.println(check(5));
        System.out.println(check(3));
    }
}
