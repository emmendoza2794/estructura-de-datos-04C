import java.util.Scanner;

/**
 * Ejercicio 3 (Interactivo) - Ordenamiento Shell
 * Semana 4: Algoritmos de Ordenamiento
 *
 * El usuario ingresa una serie de pesos y el programa los ordena
 * utilizando el algoritmo Shell Sort.
 */
public class E3ShellInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Organizador de Pesos (Shell Sort)");
        System.out.println("==============================================");

        System.out.print("¿Cuántos pesos deseas registrar? ");
        int cantidad = sc.nextInt();

        double[] pesos = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el peso " + (i + 1) + " (kg): ");
            pesos[i] = sc.nextDouble();
        }

        System.out.print("\nEstado inicial: ");
        imprimirArreglo(pesos);

        // Algoritmo Shell
        int n = pesos.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double temp = pesos[i];
                int j;
                for (j = i; j >= gap && pesos[j - gap] > temp; j -= gap) {
                    pesos[j] = pesos[j - gap];
                }
                pesos[j] = temp;
            }
        }

        System.out.println("============ Resultado ============");
        System.out.print("Pesos ordenados: ");
        imprimirArreglo(pesos);

        sc.close();
    }

    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
