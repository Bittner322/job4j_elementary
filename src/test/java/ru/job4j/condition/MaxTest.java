package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    void whenFirst1AndSecond2AndThird3Then3() {
        int first = 1, second = 2, third = 3;
        Max calc = new Max();
        int expected = 3;
        int actual = calc.max(first, second, third);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenFirst1AndSecond2AndThird3AndFourth3Then3() {
        int first = 1, second = 2, third = 3, fourth = 3;
        Max calc = new Max();
        int expected = 3;
        int actual = calc.max(first, second, third, fourth);
        assertThat(actual).isEqualTo(expected);
    }
}