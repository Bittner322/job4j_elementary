package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = postfix.length - 1; index >= postfix.length - 1; index--) {
            if (word[index] != postfix[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
