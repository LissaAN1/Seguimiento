package co.icesi.edu.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticaTest {

    @Test
    public void testRevertirString() {
        String input = "Abecedario";
        String expectedOutput = "oiradecebA";
        String actualOutput = Practica.revertirString(input);
        assertEquals(expectedOutput, actualOutput, "El método revertirString no funcionó correctamente");
    }

    @Test
    public void testProm() {
        int[] input = {1, 2, 3, 4, 5, 6};
        double expectedOutput = 3.5;
        double actualOutput = Practica.prom(input);
        assertEquals(expectedOutput, actualOutput, 0.0001, "El método prom no funcionó correctamente");
    }

    @Test
    public void testDivisionPorRestasSucesivas() {
        int dividendo = 20;
        int divisor = 3;
        int[] resultadoEsperado = {20 / 3, 20 % 3};
        System.out.println("Resultado de la división entera: " + resultadoEsperado[0]);
        System.out.println("Residuo de la división: " + resultadoEsperado[1]);
        Practica.divisionPorRestasSucesivas(dividendo, divisor);
    }
}

