/**
 * Ejercicio 1 - Arreglos Unidimensionales (Vectores)
 * Semana 3: Arreglos y Búsqueda
 *
 * Se demuestra cómo declarar, inicializar y recorrer un arreglo
 * de una sola dimensión (vector) en Java.
 */
public class E1ArreglosVectores {
    public static void main(String[] args) {

        // 1. Declaración e inicialización de un arreglo de temperaturas (double)
        // Se define el tamaño [7] para los 7 días de la semana.
        double[] temperaturas = new double[7];

        // 2. Asignación manual de valores por índice (comienza en 0)
        temperaturas[0] = 22.5; // Lunes
        temperaturas[1] = 24.0; // Martes
        temperaturas[2] = 21.8; // Miércoles
        temperaturas[3] = 25.2; // Jueves
        temperaturas[4] = 23.5; // Viernes
        temperaturas[5] = 20.1; // Sábado
        temperaturas[6] = 19.5; // Domingo

        System.out.println("==============================================");
        System.out.println("   Reporte de Temperaturas Semanales");
        System.out.println("==============================================");

        // 3. Recorrido del arreglo usando un ciclo for
        // .length nos da el tamaño total del arreglo
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + "°C");
        }

        // 4. Ejemplo de acceso directo a un elemento
        System.out.println("Temperatura del Miércoles (índice 2): " + temperaturas[2] + "°C");
    }
}
