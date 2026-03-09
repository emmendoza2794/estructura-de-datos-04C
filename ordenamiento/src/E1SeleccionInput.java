import java.util.Scanner;

/**
 * Ejercicio 1 (Interactivo) - Ordenamiento por Selección
 * Semana 4: Algoritmos de Ordenamiento
 *
 * El usuario ingresa una lista de números y el programa los ordena
 * de menor a mayor usando Selección.
 */
public class E1SeleccionInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Organizador de Inventario (Selección)");
        System.out.println("==============================================");

        System.out.print("¿Cuántos productos deseas registrar? ");
        int cantidad = sc.nextInt();

        double[] stock = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el valor del producto " + (i + 1) + ": ");
            stock[i] = sc.nextDouble();
        }

        System.out.print("\nEstado inicial: ");
        imprimirArreglo(stock);

        // Algoritmo de Selección
        int n = stock.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (stock[j] < stock[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            double temp = stock[minIdx];
            stock[minIdx] = stock[i];
            stock[i] = temp;
        }

        System.out.println("============ Resultado ============");
        System.out.print("Inventario ordenado por valor: ");
        imprimirArreglo(stock);

        sc.close();
    }

    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
