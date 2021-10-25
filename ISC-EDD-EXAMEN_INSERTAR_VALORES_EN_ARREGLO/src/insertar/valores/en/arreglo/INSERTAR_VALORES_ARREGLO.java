package insertar.valores.en.arreglo;

import java.util.Scanner;

/**
 *
 * @author equipo donut
 */
public class INSERTAR_VALORES_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int array [] = new int [15];
        
       INSERTAR_VALORES_ARREGLO.imprimir(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato "+(i+1)+": ");
            array [i] = teclado.nextInt();
            INSERTAR_VALORES_ARREGLO.imprimir(array);
            System.out.println("");
        }       
    }
    public static void imprimir(int array[]){
            for (int i = array.length -1 ; i >= 0; i--) {
            System.out.print("["+array [i]+"]");
        }
    }

}
