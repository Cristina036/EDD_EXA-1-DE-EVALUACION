package comparar_arreglos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO DONUT
 */
public class COMPARAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        int array2[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato " + (i + 1) + " del arreglo 1: ");
            array[i] = input.nextInt();
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Ingrese dato " + (i + 1) + " del arreglo 2: ");
            array2[i] = input.nextInt();
            System.out.println("");
        }
        COMPARAR_ARREGLOS.imprimir(array, array2);
        if (equals(array, array2)) {

            System.out.println("Ambos arreglos son IGUALES");
        } else {
            System.out.println("Arreglos distintos");
        }
    }

    public static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void imprimir(int array[], int array2[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("\n");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("[" + array2[i] + "]");
        }
        System.out.println("\n");
    }
}
