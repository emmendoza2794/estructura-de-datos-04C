import java.util.Scanner;

/**
 * Ejercicio 4 (Interactivo) - Ordenamiento de Caracteres
 * Semana 3: Arreglos y Búsqueda
 *
 * El usuario ingresa una palabra y el programa ordena sus letras
 * alfabéticamente usando el método de la burbuja.
 */
public class E4OrdenamientoBurbujaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Alfabetizador de Palabras");
        System.out.println("==============================================");

        System.out.print("Ingresa una palabra para ordenar sus letras: ");
        String palabra = sc.next();

        // Convertir String a un arreglo de caracteres
        char[] letras = palabra.toLowerCase().toCharArray();

        System.out.print("Estado inicial: ");
        System.out.println(new String(letras));

        // Ordenamiento Burbuja aplicado a caracteres (char)
        int n = letras.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparamos valores ASCII de los caracteres
                if (letras[j] > letras[j + 1]) {
                    char temp = letras[j];
                    letras[j] = letras[j + 1];
                    letras[j + 1] = temp;
                }
            }
        }

        System.out.println("============ Resultado ============");
        System.out.print("Palabra ordenada: " + new String(letras));
        System.out.println("(Las letras se ordenaron por su valor alfabético)");

        sc.close();
    }
}
