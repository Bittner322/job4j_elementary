package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int index = 0; index < input.length(); index++) {
            if (symbol == input.charAt(index) && index > 0) {
                counter++;
            } else {
                if (index > 0) {
                    String counterView = counter == 1 ? "" : String.valueOf(counter);
                    result.append(symbol).append(counterView);
                    counter = 1;
                }
            }
            symbol = input.charAt(index);
            if (index == input.length() - 1) {
                String counterView = counter == 1 ? "" : String.valueOf(counter);
                result.append(symbol).append(counterView);
            }
        }
        return result.toString();
    }
}
