package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPointsIs00And20Then2dot0() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected = 2.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsIs0100And20Then100dot01() {
        int x1 = 0, y1 = 100, x2 = 2, y2 = 0;
        double expected = 100.01;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPointsIs123And54AndMinus200And0Then327dot48() {
        int x1 = 123, y1 = 54, x2 = -200, y2 = 0;
        double expected = 327.48;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }
}