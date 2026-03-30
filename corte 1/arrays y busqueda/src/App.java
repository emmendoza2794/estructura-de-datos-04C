import java.util.Scanner;

/**
 * Menú principal — Arrays y Búsqueda
 * Semana 3: Estructuras de datos lineales y algoritmos de búsqueda.
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
            System.out.println("   ARRAYS Y BÚSQUEDA — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  E1 — Arreglos Unidimensionales (Vectores)");
            System.out.println("    [1] Demostración estática (Temperaturas)");
            System.out.println("    [2] Interactivo (Captura de datos)");
            System.out.println();
            System.out.println("  E2 — Operaciones con Arreglos");
            System.out.println("    [3] Demostración estática (Ventas)");
            System.out.println("    [4] Interactivo (Calculadora)");
            System.out.println();
            System.out.println("  E3 — Búsqueda Lineal");
            System.out.println("    [5] Demostración estática (Inventario)");
            System.out.println("    [6] Interactivo (Asistencia)");
            System.out.println();
            System.out.println("  E4 — Ordenamiento Burbuja");
            System.out.println("    [7] Demostración estática (Notas)");
            System.out.println("    [8] Interactivo (Alfabetizador)");
            System.out.println();
            System.out.println("  E5 — Búsqueda Binaria");
            System.out.println("    [9] Demostración estática (Biblioteca)");
            System.out.println("    [10] Interactivo (Duelo de algoritmos)");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    E1ArreglosVectores.main(new String[]{});
                    break;
                case 2:
                    E1ArreglosVectoresInput.main(new String[]{});
                    break;
                case 3:
                    E2OperacionesArreglos.main(new String[]{});
                    break;
                case 4:
                    E2OperacionesArreglosInput.main(new String[]{});
                    break;
                case 5:
                    E3BusquedaLineal.main(new String[]{});
                    break;
                case 6:
                    E3BusquedaLinealInput.main(new String[]{});
                    break;
                case 7:
                    E4OrdenamientoBurbuja.main(new String[]{});
                    break;
                case 8:
                    E4OrdenamientoBurbujaInput.main(new String[]{});
                    break;
                case 9:
                    E5BusquedaBinaria.main(new String[]{});
                    break;
                case 10:
                    E5BusquedaBinariaInput.main(new String[]{});
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
