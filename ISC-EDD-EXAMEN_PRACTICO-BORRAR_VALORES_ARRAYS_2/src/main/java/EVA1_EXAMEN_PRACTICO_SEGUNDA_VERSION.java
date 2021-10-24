
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class EVA1_EXAMEN_PRACTICO_SEGUNDA_VERSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
        int n = 0;
        // TODO code application logic here
        int [] iArray = new int [15]; 
        for (int i = 0; i < iArray.length; i++) {
           iArray[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < iArray.length; i++) {
            System.out.print("[" + iArray[i] + "]");
        }
        System.out.println("");
        System.out.println("Ingrese la posicion a eliminar (tomando en cuenta que empieza en 0 y termina en n-1): ");
        n = input.nextInt();
        for (int j = n; j < 14; j++) {
           iArray[j]= iArray[j+1];
       }
        for (int j = 0; j < 14; j++) {
            System.out.print("[" + iArray[j] + "]");
       }
    }
    
}
