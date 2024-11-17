package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        int[] numbers = new int[5];

        names[0] = "Михаил";
        names[1] = "Петр";
        names[2] = "Стас";
        names[3] = "Игорь";

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}
