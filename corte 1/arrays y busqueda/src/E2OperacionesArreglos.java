/**
 * Ejercicio 2 - Operaciones con Arreglos
 * Semana 3: Arreglos y Búsqueda
 *
 * Se demuestra cómo realizar cálculos estadísticos (Suma, Promedio, Máximo, Mínimo)
 * sobre un arreglo numérico.
 */
public class E2OperacionesArreglos {
    public static void main(String[] args) {

        // Inicialización rápida de un arreglo de ventas
        double[] ventas = {150.5, 200.0, 120.75, 310.2, 185.3};

        double suma = 0;
        double max = ventas[0];
        double min = ventas[0];

        System.out.println("==============================================");
        System.out.println("   Estadísticas de Ventas Diarias");
        System.out.println("==============================================");

        // 1. Recorrido para cálculos
        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i]; // Acumulación para la suma

            // Comparaciones para máximo y mínimo
            if (ventas[i] > max) {
                max = ventas[i];
            }
            if (ventas[i] < min) {
                min = ventas[i];
            }
        }

        // 2. Cálculo del promedio
        double promedio = suma / ventas.length;

        // 3. Resultados
        System.out.println("Total de ventas: $" + String.format("%.2f", suma));
        System.out.println("Promedio diario: $" + String.format("%.2f", promedio));
        System.out.println("Venta más alta:  $" + max);
        System.out.println("Venta más baja:   $" + min);
    }
}
