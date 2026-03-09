import java.util.Scanner;

/**
 * Ejercicio 2 (Interactivo) - Ordenamiento por Inserción
 * Semana 4: Algoritmos de Ordenamiento
 *
 * El usuario ingresa las estaturas de un equipo y el programa
 * las ordena de menor a mayor usando Inserción.
 */
public class E2InsercionInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Organizador de Estaturas (Inserción)");
        System.out.println("==============================================");

        System.out.print("¿Cuántas estaturas deseas ingresar? ");
        int cantidad = sc.nextInt();

        double[] estaturas = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la estatura (en metros) " + (i + 1) + ": ");
            estaturas[i] = sc.nextDouble();
        }

        System.out.print("\nEstado inicial: ");
        imprimirArreglo(estaturas);

        // Algoritmo de Inserción
        int n = estaturas.length;
        for (int i = 1; i < n; i++) {
            double clave = estaturas[i];
            int j = i - 1;

            while (j >= 0 && estaturas[j] > clave) {
                estaturas[j + 1] = estaturas[j];
                j = j - 1;
            }
            estaturas[j + 1] = clave;
        }

        System.out.println("============ Resultado ============");
        System.out.print("Estaturas ordenadas: ");
        imprimirArreglo(estaturas);

        sc.close();
    }

    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
