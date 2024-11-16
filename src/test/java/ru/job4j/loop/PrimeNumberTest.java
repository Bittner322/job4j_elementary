package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void whenFinish5Then3() {
        int finish = 5;
        int expected = 3;
        int output = PrimeNumber.calc(finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFinish15Then7() {
        int finish = 15;
        int expected = 6;
        int output = PrimeNumber.calc(finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFinish0Then0() {
        int finish = 0;
        int expected = 0;
        int output = PrimeNumber.calc(finish);
        assertThat(output).isEqualTo(expected);
    }
}