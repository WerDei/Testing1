package net.werdei.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionSeriesTest
{
    private static final double DELTA = 0.01;

    @Test
    @DisplayName("Series out of bounds test")
    public void outOfBoundsTest()
    {
        assertAll("arcsin",
            () -> assertTrue(Double.isNaN(FunctionSeries.arcsin(-2))),
            () -> assertTrue(Double.isNaN(FunctionSeries.arcsin(1.5)))
        );
    }


    @DisplayName("Series test")
    @ParameterizedTest
    @CsvSource({
            "-0.523598775598, -0.5",
            " 0,               0",
            "1.0471975512,     0.866"
    })
    public void arcsinSeriesTest(float result, float value)
    {
        assertEquals(result, FunctionSeries.arcsin(value), DELTA);
    }
}
