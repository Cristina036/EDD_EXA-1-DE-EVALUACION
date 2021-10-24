
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
public class EVA1_EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        System.out.println("Ingresa un numero a buscar: ");
        n = input.nextInt();
        if(BuscarNumero(n, iArray)){
            System.out.println("");
            System.out.println("Encontrado");
    }else{
            System.out.println("Numero no encontrado");
        }
           
        
    }  
    public static boolean BuscarNumero (int n, int arr[]){
        int cont = 0;
        boolean econtrado = false;
        for (int i = 0; i < arr.length; i++) {
            if(n== arr[i]){
                cont++;
            }
            if(cont>0){
                econtrado = true;
                break;
            }else {
                econtrado = false;
            }   
        }
        return econtrado;
    }
}
