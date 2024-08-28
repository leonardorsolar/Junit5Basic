package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testeSomar() {
        Calculadora calc = new Calculadora();
        int output = calc.soma(1, 2);
        assertEquals(3, output);
        assertTrue(output == 3);
        assertNotEquals(4, output);

    }

}
