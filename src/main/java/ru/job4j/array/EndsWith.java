package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = word.length - 1; index > word.length - postfix.length; index--) {
            if (word[index] != postfix[word.length - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
