import java.util.Scanner;

/**
 * Menú principal — Listas Circulares
 * Semana 8: Ciclos sin fin y sus aplicaciones.
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
            System.out.println("   LISTAS CIRCULARES — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  E1 — Estructura del Nodo Circular");
            System.out.println("    [1] Demostración manual (Nodos A, B, C)");
            System.out.println("    [2] Interactivo (Crear y cerrar ciclo)");
            System.out.println();
            System.out.println("  E2 — Operaciones de Lista Circular");
            System.out.println("    [3] Demostración automática (Insertar/Eliminar)");
            System.out.println("    [4] Interactivo (Generador de lista)");
            System.out.println();
            System.out.println("  E3 — Visualizando la Naturaleza Circular");
            System.out.println("    [5] Demo de recorrido en múltiples vueltas");
            System.out.println();
            System.out.println("  E4 — Caso Real: Turnos en Juego de Mesa");
            System.out.println("    [6] Simulador de partida (Round Robin)");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    E1EstructuraNodoCircular.main(new String[]{});
                    break;
                case 2:
                    E1EstructuraNodoCircularInput.main(new String[]{});
                    break;
                case 3:
                    E2ListaCircularBasica.main(new String[]{});
                    break;
                case 4:
                    E2ListaCircularBasicaInput.main(new String[]{});
                    break;
                case 5:
                    E3RecorridoCircular.main(new String[]{});
                    break;
                case 6:
                    E4TurnosJuego.main(new String[]{});
                    break;
                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Circulares!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
