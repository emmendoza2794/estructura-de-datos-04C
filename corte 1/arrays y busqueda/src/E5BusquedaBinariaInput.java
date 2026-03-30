import java.util.Scanner;

/**
 * Ejercicio 5 (Interactivo) - Búsqueda Binaria vs Lineal
 * Semana 3: Arreglos y Búsqueda
 *
 * El usuario puede ingresar un número y ver la diferencia en pasos
 * entre buscarlo linealmente y binariamente.
 */
public class E5BusquedaBinariaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arreglo grande generado automáticamente del 1 al 100
        int[] datos = new int[100];
        for (int i = 0; i < 100; i++) {
            datos[i] = i + 1;
        }

        System.out.println("==============================================");
        System.out.println("   Duelo de Algoritmos: Lineal vs Binaria");
        System.out.println("==============================================");

        System.out.print("Ingresa un número para buscar (1-100): ");
        int buscado = sc.nextInt();

        // 1. Simulación Búsqueda Lineal
        int pasosLineal = 0;
        for (int i = 0; i < datos.length; i++) {
            pasosLineal++;
            if (datos[i] == buscado) break;
        }

        // 2. Simulación Búsqueda Binaria
        int pasosBinario = 0;
        int inicio = 0, fin = datos.length - 1;
        while (inicio <= fin) {
            pasosBinario++;
            int medio = (inicio + fin) / 2;
            if (datos[medio] == buscado) break;
            if (datos[medio] < buscado) inicio = medio + 1;
            else fin = medio - 1;
        }

        System.out.println("============ Comparativa ============");
        System.out.println("Búsqueda Lineal:  " + pasosLineal + " comparaciones.");
        System.out.println("Búsqueda Binaria: " + pasosBinario + " comparaciones.");
        System.out.println("--------------------------------------");
        System.out.println("⚡ Ahorro de tiempo: " + (pasosLineal - pasosBinario) + " pasos.");

        sc.close();
    }
}
