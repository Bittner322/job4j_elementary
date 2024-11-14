package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMen180Then92() {
        short input = 180;
        double excepted = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double excepted = 69;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(excepted);
    }
}