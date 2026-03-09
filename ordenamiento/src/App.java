import java.util.Scanner;

/**
 * Menú principal — Algoritmos de Ordenamiento
 * Semana 4: Métodos de ordenamiento básicos (Selección, Inserción, Shell).
 */
public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   ALGORITMOS DE ORDENAMIENTO — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  E1 — Ordenamiento por Selección (Selection)");
            System.out.println("    [1] Demostración estática (Precios)");
            System.out.println("    [2] Interactivo (Inventario)");
            System.out.println();
            System.out.println("  E2 — Ordenamiento por Inserción (Insertion)");
            System.out.println("    [3] Demostración estática (Edades)");
            System.out.println("    [4] Interactivo (Estaturas)");
            System.out.println();
            System.out.println("  E3 — Ordenamiento Shell (Shell Sort)");
            System.out.println("    [5] Demostración estática (Distancias)");
            System.out.println("    [6] Interactivo (Pesos)");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    E1Seleccion.main(new String[]{});
                    break;
                case 2:
                    E1SeleccionInput.main(new String[]{});
                    break;
                case 3:
                    E2Insercion.main(new String[]{});
                    break;
                case 4:
                    E2InsercionInput.main(new String[]{});
                    break;
                case 5:
                    E3Shell.main(new String[]{});
                    break;
                case 6:
                    E3ShellInput.main(new String[]{});
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
