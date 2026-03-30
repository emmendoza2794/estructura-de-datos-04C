import java.util.Scanner;

/**
 * Ejercicio 3 (Interactivo) - Simulación de Historial de Navegador
 * Semana 6: Listas Enlazadas Simples
 *
 * El usuario puede navegar por diferentes URLs y retroceder en el historial
 * para entender cómo funciona la inserción y el movimiento de punteros.
 */
public class E3HistorialNavegadorInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistorialNavegador navegador = new HistorialNavegador();
        int opcion;

        System.out.println("==============================================");
        System.out.println("   Simulador de Navegador Web Interactiva");
        System.out.println("==============================================");

        do {
            System.out.println("\n--- Menú de Navegación ---");
            System.out.println("1. Visitar nueva URL");
            System.out.println("2. Botón 'Atrás'");
            System.out.println("3. Ver historial completo");
            System.out.println("0. Cerrar navegador");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la URL (ej: google.com): ");
                    String url = sc.next();
                    navegador.visitarPagina(url);
                    break;
                case 2:
                    navegador.irAtras();
                    break;
                case 3:
                    navegador.mostrarEstado();
                    break;
                case 0:
                    System.out.println("Cerrando el simulador...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
