import java.util.Scanner;
import java.util.Arrays;

/**
 * Ejercicio 2: Organización de Biblioteca Dinámica
 * 
 * En esta versión, la función de ordenamiento solo recibe el arreglo.
 * La función detecta automáticamente dónde terminan los libros y empiezan los ceros.
 */
public class E4Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos espacios tiene el estante? ");
        int cantidad = scanner.nextInt();

        int[] estante = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("\nIngrese ISBN para el espacio " + (i + 1) + ": ");
            estante[i] = scanner.nextInt();
            
            // La función ahora solo recibe el arreglo completo
            ordenarPorInsercion(estante);

            // Mostramos todo el arreglo (incluyendo los ceros restantes)
            System.out.println("Estado del estante: " + Arrays.toString(estante));
        }

        System.out.println("\n¡Biblioteca organizada!");
        scanner.close();
    }

    /**
     * Algoritmo de Inserción que solo recibe el arreglo.
     * Identifica los libros reales (distintos de cero) para no mover los ceros al frente.
     */
    public static void ordenarPorInsercion(int[] arr) {
        // 1. Contamos cuántos libros reales hay (asumiendo que ISBN > 0)
        int n = 0;
        while (n < arr.length && arr[n] != 0) {
            n++;
        }

        // 2. Aplicamos el ordenamiento solo a esa parte activa
        for (int i = 1; i < n; i++) {
            int clave = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = clave;
        }
    }
}


