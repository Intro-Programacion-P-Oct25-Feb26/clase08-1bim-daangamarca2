/*
 Agregar lo correspondiente para que el proceso siguiente permita
 sumar las notas en cada iteración y presentar en la cadena final el
 valor de la suma.
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        boolean bandera = true;
        int salida;
        double sumaNotas = 0;
        
        do {
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            sumaNotas = sumaNotas + nota;
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, 
                    nota);
            
            System.out.println("Ingrese (-111) si desea salir del ciclo ");
            salida = entrada.nextInt();

            if (salida == -111) {
                bandera = false;
            }

        } while (bandera); // (bandera==true)
        
        cadenaFinal = String.format("%s\n", cadenaFinal);
        cadenaFinal = String.format("%sLa suma es %.2f", cadenaFinal, sumaNotas);
        System.out.printf("Listado de Notas\n%s\n", cadenaFinal);
    }
}
