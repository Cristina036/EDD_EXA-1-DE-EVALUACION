package juego_del_ahorcado;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class Juego_del_ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //INICIO DEL JUEGO
        Juego_del_ahorcado.jugar();

    }

    public static void jugar() {

        //DECLARACIÓN DE VARIABLES
        Scanner input = new Scanner(System.in);
        char[] Pérdidas = new char[6];
        String Opcion_usuario, Opcion_Res;
        int Op_perdida = 0, Opcion_SN, Palabra_Random, cont_Oculto = 0;
        boolean letra_encontrada = false, resuelto = false;

        char[][] iPalabras = {{'s', 'i', 's', 't', 'e', 'm', 'a'}, {'e', 'x', 'a', 'm', 'e', 'n'},
        {'s', 't', 'a', 'c', 'k'}, {'h', 'e', 'a', 'p'}, {'j', 'a', 'v', 'a'}};

        Palabra_Random = (int) (Math.random() * iPalabras.length); //SE ELIGE UNA PALABRA AL AZAR
        char[] Palabra_Oculta = new char[iPalabras[Palabra_Random].length];
        for (int i = 0; i < iPalabras[Palabra_Random].length; i++) { //FOR PARA REMPLAZAR LETRAS POR ESPACIOS

            Palabra_Oculta[i] = '_';
        }

        while (Op_perdida < 4 && !resuelto) { //BARRA DE INFO DEL PROGRESO
            System.out.println("---------------------------");
            System.out.println("Tienes " + (4 - Op_perdida) + " intentos.");
            System.out.print("Palabra: ");
            for (int i = 0; i < iPalabras[Palabra_Random].length; i++) {
                System.out.print(Palabra_Oculta[i] + " ");

            }

            System.out.print("\nLetras usadas: ");
            for (int i = 0; i < Pérdidas.length; i++) {
                System.out.print(Pérdidas[i]);
            }
            System.out.print("\nLetra elegida: ");
            Opcion_usuario = input.next();
            letra_encontrada = false;

            System.out.println("\n¿Sabes la palabra? (Si= 0 /No= 1)"); 
            Opcion_SN = input.nextInt();
            if (Opcion_SN == 0) {
                System.out.println("¿Cual es la palabra?");
                Opcion_Res = input.next();

                if (String.valueOf(iPalabras[Palabra_Random]).equals(Opcion_Res)) {
                    System.out.println("\n¡GANASTE!");
                    Juego_del_ahorcado.volver(); //METODO VOLVER 
                } else {
                    System.out.println("PERDISTE" + "\n" + "La palabra era: ");
                    System.out.print(iPalabras[Palabra_Random]);
                    System.out.println("");
                    Juego_del_ahorcado.volver();
                    System.exit(0);
                }
            }

            for (int i = 0; i < iPalabras[Palabra_Random].length; i++) {
                if (Opcion_usuario.charAt(0) == iPalabras[Palabra_Random][i]) {
                    Palabra_Oculta[i] = iPalabras[Palabra_Random][i];
                    letra_encontrada = true;
                }
            }
            if (!letra_encontrada) {
                Op_perdida++;
                Pérdidas[Op_perdida] = Opcion_usuario.charAt(0);
            }
            cont_Oculto = 0;
            for (int i = 0; i < iPalabras[Palabra_Random].length; i++) {

                if ('_' == Palabra_Oculta[i]) {

                    cont_Oculto++;
                }
            }
            System.out.println(cont_Oculto);
            if (cont_Oculto > 0) {
                resuelto = false;
            } else {
                resuelto = true;
            }
        }

        System.out.println("---------------------------\n");
        System.out.println("Tienes " + (4 - Op_perdida) + " intentos.");

        System.out.print("Palabra:");
        for (int i = 0; i < iPalabras[Palabra_Random].length; i++) {
            System.out.print(Palabra_Oculta[i] + " ");
        }
        System.out.print("\nUsadas: ");
        for (int i = 0; i < Pérdidas.length; i++) {
            System.out.print(Pérdidas[i]);
        }

        if (cont_Oculto <= 0) {
            System.out.println("\n¡GANASTE!");
            Juego_del_ahorcado.volver(); //METODO VOLVER
        } else {
            System.out.println("\nPERDISTE" + "\n" + "La palabra era: ");
            System.out.print(iPalabras[Palabra_Random]);
            System.out.println("\n");
            Juego_del_ahorcado.volver();//METODO VOLVER
        }
    }

    public static void volver() { //NOS PERMITE PREGUNTAR AL USUARIO SI QUIERE VOLVER A JUGAR
        Scanner input = new Scanner(System.in);
        int Op_Volver;
        System.out.println("¿Quieres volver a jugar? ((Si= 0 /No= 1)");
        Op_Volver = input.nextInt();
        if (Op_Volver == 1) {
            System.out.println("Adios");           
            System.exit(0);
        } else {
            Juego_del_ahorcado.jugar(); //INICIO NUEVAMENTE DEL JUEGO A PETICION DEL USUARIO
        }
    }
}
