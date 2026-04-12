/**
 * Ejemplo 2: Operaciones Básicas de la Lista Circular (Demostración Automática)
 *
 * Se muestran las tres operaciones fundamentales:
 *   - Inserción al final
 *   - Inserción al inicio
 *   - Eliminación por valor
 *
 * Después de cada operación se imprime la lista para ver el efecto.
 */
public class E2ListaCircularBasica {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        // 1. Insertar al final
        System.out.println("=== INSERCIÓN AL FINAL ===");
        lista.insertarAlFinal(10);
        lista.mostrar(); // [10] -> (cabeza)

        lista.insertarAlFinal(20);
        lista.mostrar(); // [10] -> [20] -> (cabeza)

        lista.insertarAlFinal(30);
        lista.mostrar(); // [10] -> [20] -> [30] -> (cabeza)

        // 2. Insertar al inicio
        System.out.println("\n=== INSERCIÓN AL INICIO ===");
        lista.insertarAlInicio(5);
        lista.mostrar(); // [5] -> [10] -> [20] -> [30] -> (cabeza)

        lista.insertarAlInicio(1);
        lista.mostrar(); // [1] -> [5] -> [10] -> [20] -> [30] -> (cabeza)

        // 3. Eliminar un nodo del interior
        System.out.println("\n=== ELIMINACIÓN (valor = 10) ===");
        lista.eliminar(10);
        lista.mostrar(); // [1] -> [5] -> [20] -> [30] -> (cabeza)

        // 4. Eliminar la cabeza
        System.out.println("\n=== ELIMINACIÓN (valor = 1, la cabeza) ===");
        lista.eliminar(1);
        lista.mostrar(); // [5] -> [20] -> [30] -> (cabeza)

        // 5. Eliminar la cola
        System.out.println("\n=== ELIMINACIÓN (valor = 30, la cola) ===");
        lista.eliminar(30);
        lista.mostrar(); // [5] -> [20] -> (cabeza)
    }
}
