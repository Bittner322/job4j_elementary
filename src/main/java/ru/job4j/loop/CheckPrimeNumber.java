package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static void main(String[] args) {
        System.out.println(check(6));
        System.out.println(check(5));
        System.out.println(check(3));
        System.out.println(check(4));
        System.out.println(check(53));
    }
}
