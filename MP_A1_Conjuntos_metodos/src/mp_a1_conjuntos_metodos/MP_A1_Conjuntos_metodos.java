package mp_a1_conjuntos_metodos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO DONUT
 */
public class MP_A1_Conjuntos_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);
        Scanner stri = new Scanner(System.in);

        MP_A1_Conjuntos_metodos obj = new MP_A1_Conjuntos_metodos();
        int x = 0;
        int cero = 0;
        String U = " ";

        System.out.print("¿Cuantos conjuntos deseas trabajar?\n(Minimo 2 maximo 5)");
        x = palabra.nextInt();
        if (x > 5) {
            System.out.println("Solo se pueden introducir 2 o maximo 5 conjuntos\nVuelva a escribir el numero de conjuntos");
            x = palabra.nextInt();
        }
        System.out.println(" ");

        obj.metodos(x);
        System.out.println(" ");

        while (cero != 5) {
            System.out.println("¿Que operación desea hacer?");
            System.out.println("1.Unión\n2.Intersección\n3.Resta\n4.Complemento\n5.Cerrar programa");
            System.out.println("Escriba el número de la opción que desea");
            cero = palabra.nextInt();//La variable 0 va tomar el numero que le de el usuario

            switch (cero) {

                case 1:
                    System.out.println("Los conjuntos los debe escribir en MAYUSCULA");
                    System.out.println("Unio se pone una U MAYUSCULA entre los conjuntos.\nEjemplo: AUD, EUA.");
                    U = stri.nextLine();
                    obj.union(U);
                    break;

                case 2:
                    System.out.println("Los conjuntos los debe escribir en MAYUSCULAS");
                    System.out.println("Unio se pone una U MAYUSCULA entre los conjuntos.\nEjemplo: CnE, DnB.");
                    U = stri.nextLine();
                    obj.interseccion(U);
                    break;

                case 3:
                    System.out.println("Los conjuntos los debe escribir en MAYUSCULAS");
                    System.out.println("Resta se pone el signo - entre los conjuntos.\nEjemplo: E-B, C-E.");
                    U = stri.nextLine();
                    obj.Resta(U);
                    break;

                case 4:
                    System.out.println("Los conjuntos los debe escribir en MAYUSCULAS");
                    System.out.println("Complemento se pone una c minuscula despues del conjuntos.\nEjemplo: Ac, Cc.");
                    U = stri.nextLine();
                    obj.complemento(U);
                    break;
            }
        }
    }
}

