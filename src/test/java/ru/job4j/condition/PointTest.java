package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPointsIs00And20Then2dot0() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsIs0100And20Then100dot01() {
        int x1 = 0, y1 = 100, x2 = 2, y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 100.01;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPointsIs123And54AndMinus200And0Then327dot48() {
        int x1 = 123, y1 = 54, x2 = -200, y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 327.48;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPointsIs123And321Then2dot82() {
        int x1 = 1, y1 = 2, z1 = 3, x2 = 3, y2 = 2, z2 = 1;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double expected = 2.82;
        double actual = a.distance3d(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsIs123And567Then6dot92() {
        int x1 = 1, y1 = 2, z1 = 3, x2 = 5, y2 = 6, z2 = 7;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double expected = 6.92;
        double actual = a.distance3d(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }
}