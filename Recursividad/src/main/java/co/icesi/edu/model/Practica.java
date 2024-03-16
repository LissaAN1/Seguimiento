package co.icesi.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Practica {
    public static String revertirString(String str) {
        if (str.isEmpty())
            return str;
        return revertirString(str.substring(1)) + str.charAt(0);
    }
    public static double prom(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
    }
    public static void divisionPorRestasSucesivas(int dividendo, int divisor) {
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        System.out.println("Resultado de la división entera: " + cociente);
        System.out.println("Residuo de la división: " + dividendo);
    }
    public static int mcdEuclides(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcdEuclides(b, a % b);
    }
    public static final int[] S = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50};
    public static List<Integer> encontrarCambio(int target) {
        List<Integer> solucion = new ArrayList<>();
        encontrarCambioRecursivo(target, solucion, 0);
        return solucion;
    }

    private static boolean encontrarCambioRecursivo(int target, List<Integer> solucion, int indice) {
        if (target == 0) {
            return true;
        }
        if (target < 0 || indice == S.length) {
            return false;
        }

        if (encontrarCambioRecursivo(target - S[indice], solucion, indice)) {
            solucion.add(S[indice]);
            return true;
        }
        return encontrarCambioRecursivo(target, solucion, indice + 1);
    }






}
