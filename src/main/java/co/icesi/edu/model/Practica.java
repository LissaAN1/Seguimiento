package co.icesi.edu.model;

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

}
