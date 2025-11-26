/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal;
        int nota;
        int salida;
        String nombre;
        String calificacion;
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;
        cadenaFinal = "";

        do {
            System.out.println("Ingrese el nombre del estudiante:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la calificación del estudiante:");
            nota = entrada.nextInt();

            if (nota >= 5) {
                calificacion = "(Muy buena)";
            } else {
                calificacion = "(Buena)";
            }

            cadenaFinal = String.format("%s\nListado de Notas\nCalificación"
                    + " %d %s del estudiante %s",
                    cadenaFinal,
                    nota,
                    calificacion,
                    nombre);
            // agrego valor al acumulador
            suma = suma + nota;
             // agrego una unidad al contador para luego sacar el promedio
            contador_calificaciones = contador_calificaciones + 1;

            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();

            if (salida == -111) {
                bandera = false;
            }

            // Limpia el buffer de entrada para la próxima lectura de String
            entrada.nextLine();

        } while (bandera);

        // Calcula el promedio asegurando la división con punto flotante (double)
        if (contador_calificaciones > 0) {
            promedio = (double) suma / contador_calificaciones;
        } else {
            promedio = 0.0;
        }

        // Agrega la línea divisoria y el promedio al reporte final
        cadenaFinal = String.format("%s\n\nPromedio de calificaciones: %.2f",
                cadenaFinal,
                promedio);

        // Muestra el reporte final
        System.out.printf("%s\n", cadenaFinal);
    }
}