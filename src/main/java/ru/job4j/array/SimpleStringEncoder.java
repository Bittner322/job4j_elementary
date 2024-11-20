package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int index = 1; index < input.length(); index++) {
            if (symbol == input.charAt(index)) {
                counter++;
            } else {
                String counterView = counter == 1 ? "" : String.valueOf(counter);
                result.append(symbol).append(counterView);
                counter = 1;
            }
            symbol = input.charAt(index);
        }
        String counterView = counter == 1 ? "" : String.valueOf(counter);
        result.append(symbol).append(counterView);
        return result.toString();
    }
}
