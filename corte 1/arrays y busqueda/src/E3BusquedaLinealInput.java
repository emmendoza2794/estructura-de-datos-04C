import java.util.Scanner;

/**
 * Ejercicio 3 (Interactivo) - Búsqueda Lineal
 * Semana 3: Arreglos y Búsqueda
 *
 * El usuario puede buscar un nombre en una lista de asistencia
 * para practicar comparaciones y estados booleanos.
 */
public class E3BusquedaLinealInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Consulta de Asistencia a Clase");
        System.out.println("==============================================");

        // Lista predefinida
        String[] estudiantes = {"Ana", "Beto", "Carlos", "Dina", "Elena", "Fabian"};

        System.out.println("Lista de estudiantes registrados: ");
        for (String e : estudiantes) {
            System.out.print("[" + e + "] ");
        }

        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String nombreBuscado = sc.next();

        boolean presente = false;
        int indice = -1;

        // Proceso de búsqueda
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].equalsIgnoreCase(nombreBuscado)) {
                presente = true;
                indice = i;
                break;
            }
        }

        System.out.println("============ Resultado ============");
        if (presente) {
            System.out.println("El estudiante " + nombreBuscado + " está ASISTIÓ.");
            System.out.println("Se encuentra en la posición #" + (indice + 1) + " de la lista.");
        } else {
            System.out.println("El estudiante " + nombreBuscado + " NO está en la lista.");
        }

        sc.close();
    }
}
