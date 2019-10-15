package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void should_calculate_total_price() {
        PriceCalculator calculator = new PriceCalculator();

        double result = calculator.getPrice(2, 5);

        assertThat(11.0, is(result));
    }
}