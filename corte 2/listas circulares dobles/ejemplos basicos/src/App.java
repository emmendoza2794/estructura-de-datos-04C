import java.util.Scanner;

/**
 * Menú principal — Listas Circulares Dobles
 * Semana 9: Estructuras circulares con puntero anterior y siguiente.
 *
 * Punto de entrada para explorar los ejemplos de listas circulares dobles.
 */
public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   LISTAS CIRCULARES DOBLES — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  E1 — El Nodo Doble Circular (Concepto)");
            System.out.println("    [1] Demo manual (ciclo con 3 nodos)");
            System.out.println("    [2] Interactivo (tus propios valores)");
            System.out.println();
            System.out.println("  E2 — Operaciones en Lista Circular Doble");
            System.out.println("    [3] Demo automática (insertar/eliminar)");
            System.out.println("    [4] Menú interactivo de operaciones");
            System.out.println();
            System.out.println("  E3 — Recorrido Bidireccional");
            System.out.println("    [5] Dos vueltas adelante y atrás");
            System.out.println();
            System.out.println("  E4 — Caso de Uso Real");
            System.out.println("    [6] Playlist Musical");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    E1EstructuraNodoDoble.main(new String[]{});
                    break;
                case 2:
                    E1EstructuraNodoDobleInput.main(new String[]{});
                    break;
                case 3:
                    E2OperacionesDoble.main(new String[]{});
                    break;
                case 4:
                    E2OperacionesDobleInput.main(new String[]{});
                    break;
                case 5:
                    E3RecorridoBidireccional.main(new String[]{});
                    break;
                case 6:
                    E4PlaylistMusical.main(new String[]{});
                    break;
                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Circulares Dobles!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
