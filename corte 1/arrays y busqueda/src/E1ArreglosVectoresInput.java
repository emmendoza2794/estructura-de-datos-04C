import java.util.Scanner;

/**
 * Ejercicio 1 (Interactivo) - Arreglos Unidimensionales
 * Semana 3: Arreglos y Búsqueda
 *
 * El usuario ingresa las temperaturas de la semana para practicar
 * el llenado de arreglos mediante ciclos y entrada de datos.
 */
public class E1ArreglosVectoresInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Captura de Datos — Temperaturas");
        System.out.println("==============================================");

        // Definimos el tamaño del arreglo
        double[] temperaturas = new double[7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Llenado del arreglo con un ciclo for e interacción con el usuario
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura para el " + dias[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        System.out.println("============ Resumen Semanal ============");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(dias[i] + ": " + temperaturas[i] + "°C");
        }

        sc.close();
    }
}
