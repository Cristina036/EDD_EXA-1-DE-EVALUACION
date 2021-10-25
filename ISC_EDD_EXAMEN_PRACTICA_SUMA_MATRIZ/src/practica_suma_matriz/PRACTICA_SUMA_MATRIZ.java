/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_suma_matriz;

import java.util.Scanner;

/**
 *
 * @author rocio
 */
public class PRACTICA_SUMA_MATRIZ {

    static int[][] matriz = null;
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        matriz = definirTamano(matriz);
        System.out.println("FILAS: " + matriz.length);
        System.out.println("COLUMNAS: " + matriz[0].length);

        System.out.println();
        ingresarValores(matriz);
        System.out.println();
        imprimirMatriz(matriz);
    }

    public static int[][] definirTamano(int[][] x) {
        /* System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ FILAS&COLUMNAS");
        String datosIngresados = sc.next();

        String[] datos = datosIngresados.split("&");

        int filas = Integer.parseInt(datos[0]);
        int columnas = Integer.parseInt(datos[1]);*/

        x = new int[3][3];

        return x;
    }

    public static void ingresarValores(int[][] x) {
        System.out.println("INGRESE VALORES DE LA MATRIZ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = Integer.parseInt(sc.next());
            }
        }
    }

    public static void imprimirMatriz(int[][] x) {
        System.out.println("PROMEDIOS DE LA MATRIZ");

        //imprimir matriz
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("[" + x[i][j] + "]");
            }

            System.out.println("");

        }
System.out.println("");
        //promedios filas
        for (int i = 0; i < x.length; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < x[i].length; j++) {
                sumaFilas += x[i][j];
            }
            double prom = (double) sumaFilas / 3;
            System.out.print("El promedio de la fila " + i + " es igual a: " + prom+"\n");

        }
        System.out.println("");
        
        //promedios columnas
        for (int i = 0; i < x.length; i++) {
            int sumaColumnas = 0;
            for (int j = 0; j < x[i].length; j++) {
                sumaColumnas += x[j][i];
            }
            double prom = (double) sumaColumnas / 3;
            System.out.print("El promedio de la columna " + i + " es igual a: " + prom+"\n");

        }
        System.out.println("");

    }

}
