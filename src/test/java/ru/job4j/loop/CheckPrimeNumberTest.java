package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CheckPrimeNumberTest {

    @Test
    void check6ThenFalse() {
        int number = 6;
        boolean output = CheckPrimeNumber.check(number);
        assertThat(output).isFalse();
    }

    @Test
    void check12ThenFalse() {
        int number = 12;
        boolean output = CheckPrimeNumber.check(number);
        assertThat(output).isFalse();
    }

    @Test
    void check1ThenTrue() {
        int number = 1;
        boolean output = CheckPrimeNumber.check(number);
        assertThat(output).isTrue();
    }

    @Test
    void check54ThenFalse() {
        int number = 54;
        boolean output = CheckPrimeNumber.check(number);
        assertThat(output).isFalse();
    }

}