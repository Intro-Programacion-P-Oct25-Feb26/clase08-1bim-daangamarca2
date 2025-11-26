/*
 Al ejecutar el siguiente código, el usuario puede salir del ciclo cuando
ingrese las siguientes opciones
s
si
yes
y

para la solucion usar switch

 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        boolean bandera = true;
        String salida;
        do {
            System.out.println("Ingrese calificación");
            nota = entrada.nextDouble();
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, nota);
            entrada.nextLine(); // limpieza de buffer

            System.out.println("Ingrese (s, si, yes o y) si desea salir del ciclo ");
            salida = entrada.nextLine();

            switch (salida) {
                case "s":
                case "si":
                case "yes":
                case "y":
                    bandera = false;
                    break;
            }
        } while (bandera);
        System.out.printf("Listado de Notas\n%s\n", cadenaFinal);
    }
}
