import java.util.Scanner;

/**
 * Ejercicio 2 (Interactivo) - Operaciones con Arreglos
 * Semana 3: Arreglos y Búsqueda
 *
 * El usuario ingresa una cantidad N de datos y el programa
 * calcula las estadísticas automáticamente.
 */
public class E2OperacionesArreglosInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Calculadora de Estadísticas");
        System.out.println("==============================================");

        System.out.print("¿Cuántas ventas deseas registrar?: ");
        int n = sc.nextInt();

        double[] ventas = new double[n];
        double suma = 0;

        // Captura de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Venta #" + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
            suma += ventas[i];
        }

        // Búsqueda de Max y Min
        double max = ventas[0];
        double min = ventas[0];

        for (int i = 1; i < n; i++) {
            if (ventas[i] > max) max = ventas[i];
            if (ventas[i] < min) min = ventas[i];
        }

        System.out.println("============ Resultados ============");
        System.out.println("Suma Total:    $" + suma);
        System.out.println("Promedio:      $" + (suma / n));
        System.out.println("Venta Máxima:  $" + max);
        System.out.println("Venta Mínima:  $" + min);

        sc.close();
    }
}
