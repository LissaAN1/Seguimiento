package co.icesi.edu.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import co.icesi.edu.model.*;

public class Main{
    public static void main(String[] args) {
        String archivoDatos = "C:\\Users\\User\\OneDrive\\Escritorio\\trabajos\\ICESI\\Tercer Semestre\\APO II\\Semana 7\\Seguimiento\\Ordenamiento\\src\\main\\java\\co\\icesi\\edu\\Datos.txt";

        try {

            File file = new File(archivoDatos);
            Scanner scanner = new Scanner(file);


            int numPaises = scanner.nextInt();
            scanner.nextLine();

            List<Pais> paises = new ArrayList<>();

            for (int i = 0; i < numPaises; i++) {
                String[] datos = scanner.nextLine().split(";");
                String nombre = datos[0];
                int oroMasculino = Integer.parseInt(datos[1]);
                int plataMasculino = Integer.parseInt(datos[2]);
                int bronceMasculino = Integer.parseInt(datos[3]);
                int oroFemenino = Integer.parseInt(datos[4]);
                int plataFemenino = Integer.parseInt(datos[5]);
                int bronceFemenino = Integer.parseInt(datos[6]);

                paises.add(new Pais(nombre, oroMasculino, plataMasculino, bronceMasculino,
                        oroFemenino, plataFemenino, bronceFemenino));
            }


            Collections.sort(paises, new ComparadorMasculino());
            System.out.println("Masculino");
            for (Pais pais : paises) {
                System.out.printf("%s %d %d %d\n", pais.getNombre(), pais.getOroMasculino(), pais.getPlataMasculino(), pais.getBronceMasculino());
            }
            System.out.println("----------");


            Collections.sort(paises);
            System.out.println("Femenino");
            for (Pais pais : paises) {
                System.out.printf("%s %d %d %d\n", pais.getNombre(), pais.getOroFemenino(), pais.getOroFemenino(), pais.getBronceFemenino());
            }
            System.out.println("----------");


            bubbleSortCombinado(paises);
            System.out.println("Combinado");
            for (Pais pais : paises) {
                int totalOro = pais.getOroMasculino() + pais.getOroFemenino();
                int totalPlata = pais.getPlataMasculino() + pais.getPlataFemenino();
                int totalBronce = pais.getBronceMasculino() + pais.getBronceFemenino();
                System.out.printf("%s %d %d %d\n", pais.getNombre(), totalOro, totalPlata, totalBronce);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo: " + archivoDatos);
            e.printStackTrace();
        }
    }


    public static void bubbleSortCombinado(List<Pais> paises) {
        int n = paises.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Pais pais1 = paises.get(j);
                Pais pais2 = paises.get(j + 1);
                int totalOro1 = pais1.getOroMasculino() + pais1.getOroFemenino();
                int totalOro2 = pais2.getOroMasculino() + pais2.getOroFemenino();
                int totalPlata1 = pais1.getPlataMasculino() + pais1.getPlataFemenino();
                int totalPlata2 = pais2.getPlataMasculino() + pais2.getPlataFemenino();
                int totalBronce1 = pais1.getBronceMasculino() + pais1.getBronceFemenino();
                int totalBronce2 = pais2.getBronceMasculino() + pais2.getBronceFemenino();

                if (totalOro1 < totalOro2 ||
                        (totalOro1 == totalOro2 && totalPlata1 < totalPlata2) ||
                        (totalOro1 == totalOro2 && totalPlata1 == totalPlata2 && totalBronce1 < totalBronce2) ||
                        (totalOro1 == totalOro2 && totalPlata1 == totalPlata2 && totalBronce1 == totalBronce2 && pais1.getNombre().compareTo(pais2.getNombre()) > 0)) {
                    // Swap paises[j] y paises[j+1]
                    Pais temp = paises.get(j);
                    paises.set(j, paises.get(j + 1));
                    paises.set(j + 1, temp);
                }
            }
        }
    }
}

