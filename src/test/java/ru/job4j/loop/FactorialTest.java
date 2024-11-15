package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenNumber8Then40320() {
        int input = 8;
        int expected = 40320;
        int output = Factorial.calculate(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenNumber0Then1() {
        int input = 0;
        int expected = 1;
        int output = Factorial.calculate(input);
        assertThat(output).isEqualTo(expected);
    }
}