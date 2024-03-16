package co.icesi.edu.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    @Test
    public void testMcdEuclides() {
        int a = 84;
        int b = 18;
        int expectedMcd = 6;
        int actualMcd = Practica.mcdEuclides(a, b);
        assertEquals(expectedMcd, actualMcd, "El método mcdEuclides no funcionó correctamente");
    }
    @Test
    public void testEncontrarCambio() {
        int target = 82500;
        List<Integer> expectedSolution = Arrays.asList(50000, 20000, 10000, 2000, 500);
        List<Integer> actualSolution = Practica.encontrarCambio(target);
        for (int i = 0, j = actualSolution.size() - 1; i < j; i++, j--) {
            int temp = actualSolution.get(i);
            actualSolution.set(i, actualSolution.get(j));
            actualSolution.set(j, temp);
        }
        assertEquals(expectedSolution, actualSolution, "El método encontrarCambio no funcionó correctamente para el valor " + target);
    }
}

