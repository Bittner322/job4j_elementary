package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStartCounterIsMoreThanFinishThen0() {
        int start = 5, finish = 1;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartCounter0AndFinish5Then15() {
        int start = 0, finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartCounterIsMinus5AndFinish15Then24() {
        int start = -5, finish = 10;
        int expected = 24;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartCounter52AndFinish54Then106() {
        int start = 52, finish = 54;
        int expected = 106;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}