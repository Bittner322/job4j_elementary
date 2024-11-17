package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 4, 10};
        int expected = 0;
        int output = FindLoop.indexOf(data, 5);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenArrayIsNotHas5ThenMinus1() {
        int[] data = new int[] {4, 10};
        int expected = -1;
        int output = FindLoop.indexOf(data, 5);
        assertThat(output).isEqualTo(expected);
    }
}