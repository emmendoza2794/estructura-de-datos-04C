import java.util.Scanner;

/**
 * Menú principal — Listas Enlazadas Simples
 * Semana 6: Introducción a las estructuras de datos dinámicas.
 *
 * Permite ejecutar cada ejercicio (estático o interactivo) desde
 * un único punto de entrada de manera sencilla.
 */
public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   LISTAS ENLAZADAS — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  E1 — Estructura Básica: El Nodo");
            System.out.println("    [1] Demostración manual (Nodos A, B, C)");
            System.out.println("    [2] Interactivo (Crear y conectar)");
            System.out.println();
            System.out.println("  E2 — Implementación de Lista Enlazada");
            System.out.println("    [3] Demostración automática (Inserción inicio)");
            System.out.println("    [4] Interactivo (Generador de listas)");
            System.out.println();
            System.out.println("  E3 — Ejemplo Real: Historial Navegador");
            System.out.println("    [5] Simulación automática (URLs)");
            System.out.println("    [6] Simulador interactivo");
            System.out.println();
            System.out.println("  E4 — Ejemplo Real: Turnos Hospital");
            System.out.println("    [7] Simulación automática (Urgencias)");
            System.out.println("    [8] Simulador interactivo de colas");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    E1EstructuraNodo.main(new String[]{});
                    break;
                case 2:
                    E1EstructuraNodoInput.main(new String[]{});
                    break;
                case 3:
                    E2ListaEnlazadaBasica.main(new String[]{});
                    break;
                case 4:
                    E2ListaEnlazadaBasicaInput.main(new String[]{});
                    break;
                case 5:
                    E3HistorialNavegador.main(new String[]{});
                    break;
                case 6:
                    E3HistorialNavegadorInput.main(new String[]{});
                    break;
                case 7:
                    E4ColaHospital.main(new String[]{});
                    break;
                case 8:
                    E4ColaHospitalInput.main(new String[]{});
                    break;
                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Enlazadas!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
