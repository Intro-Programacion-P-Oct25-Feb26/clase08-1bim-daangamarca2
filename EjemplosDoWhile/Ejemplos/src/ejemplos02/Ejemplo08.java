/*
Modifique la solución, de tal manera que se genere la siguiente serie
+1/1
-2/2
+3/3
-4/4
+5/5
-6/6
+7/7
-8/8
+9/9
-10/10

 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {

        // TODO code application logic here
        int limite = 10;
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadena = "";

        do {
            // para manejar el signo asociado 
            if (denominador % 2 == 0) {
                signo = "-";
            } else {
                signo = "+";
            }
            
            cadena = String.format("%s%s%d/%d\n", 
                    cadena,
                    signo,
                    numerador, 
                    denominador);
            numerador = numerador + 1;
            denominador = denominador + 1;

        } while (denominador <= limite);

        System.out.println(cadena);

    }
}
