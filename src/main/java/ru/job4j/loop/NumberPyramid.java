package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        if (n >= 2) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 9:");
        draw(9);
    }
}
