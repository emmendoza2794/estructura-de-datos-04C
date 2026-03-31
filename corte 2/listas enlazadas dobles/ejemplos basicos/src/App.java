import java.util.Scanner;

/**
 * Menú principal — Listas Enlazadas Dobles
 * Semana 7: Estructuras con puntero anterior y siguiente.
 *
 * Punto de entrada para explorar los ejemplos de listas dobles.
 */
public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   LISTAS DOBLES — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  E1 — El Nodo Doble (Concepto)");
            System.out.println("    [1] Demo manual (A <-> B <-> C)");
            System.out.println("    [2] Interactivo (Conexión manual)");
            System.out.println();
            System.out.println("  E2 — Operaciones de Lista Doble");
            System.out.println("    [3] Demo automática (Inicio/Final)");
            System.out.println("    [4] Generador interactivo de lista");
            System.out.println();
            System.out.println("  E3 — Navegación Bidireccional");
            System.out.println("    [5] Simulador de Menú Completo");
            System.out.println();
            System.out.println("  E4 — Caso de Uso Real");
            System.out.println("    [6] Gestión de Tareas (Simple)");
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
                    E2ListaDobleBasica.main(new String[]{});
                    break;
                case 4:
                    E2ListaDobleBasicaInput.main(new String[]{});
                    break;
                case 5:
                    E3RecorridoBidireccional.main(new String[]{});
                    break;
                case 6:
                    E4GestionTareas.main(new String[]{});
                    break;
                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
