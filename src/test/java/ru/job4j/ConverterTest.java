package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        double input = 140;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert200RblThen2dot85Dollar() {
        double input = 200;
        double expected = 3.33;
        double output = Converter.rubleToDollar(input);
        double value = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}