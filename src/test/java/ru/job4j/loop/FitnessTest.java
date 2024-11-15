package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitnessTest {

    @Test
    void whenIvan90AndNick150Then2() {
        int ivan = 90, nick = 150;
        int expected = 2;
        int output = Fitness.calc(ivan, nick);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenIvan130AndNick150Then1() {
        int ivan = 130, nick = 150;
        int expected = 1;
        int output = Fitness.calc(ivan, nick);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenIvan130AndNick90Then0() {
        int ivan = 130, nick = 90;
        int expected = 0;
        int output = Fitness.calc(ivan, nick);
        assertThat(output).isEqualTo(expected);
    }
}