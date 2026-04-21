/**
 * Ejemplo 1: Estructura del Nodo Doble Circular
 * Creamos tres nodos a mano y los conectamos manualmente formando
 * un ciclo doble: cada nodo apunta al siguiente Y al anterior,
 * y el último regresa al primero cerrando el círculo en ambas direcciones.
 */
public class E1EstructuraNodoDoble {
    public static void main(String[] args) {
        // 1. Crear tres nodos aislados
        NodoDoble nodo1 = new NodoDoble(10);
        NodoDoble nodo2 = new NodoDoble(20);
        NodoDoble nodo3 = new NodoDoble(30);

        // 2. Conectar hacia adelante (siguiente)
        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        nodo3.siguiente = nodo1; // Cierra el círculo hacia adelante

        // 3. Conectar hacia atrás (anterior) — esto distingue la lista circular DOBLE
        nodo1.anterior = nodo3; // El primero apunta al último
        nodo2.anterior = nodo1;
        nodo3.anterior = nodo2;

        // 4. Verificar la invariante del ciclo doble
        System.out.println("=== Verificación del ciclo doble ===");
        System.out.println("nodo3.siguiente == nodo1: " + (nodo3.siguiente == nodo1)); // true
        System.out.println("nodo1.anterior  == nodo3: " + (nodo1.anterior == nodo3));  // true
        System.out.println("nodo1.siguiente.anterior == nodo1: " + (nodo1.siguiente.anterior == nodo1)); // true

        // 5. Recorrido completo hacia adelante (una vuelta)
        System.out.println("\n=== Recorrido hacia adelante ===");
        NodoDoble actual = nodo1;
        do {
            System.out.println("  Dato: " + actual.dato
                    + "  | anterior: " + actual.anterior.dato
                    + "  | siguiente: " + actual.siguiente.dato);
            actual = actual.siguiente;
        } while (actual != nodo1);

        // 6. Recorrido completo hacia atrás (una vuelta desde el último)
        System.out.println("\n=== Recorrido hacia atrás ===");
        actual = nodo3; // La "cola" es nodo1.anterior
        NodoDoble inicio = actual;
        do {
            System.out.println("  Dato: " + actual.dato
                    + "  | siguiente: " + actual.siguiente.dato
                    + "  | anterior:  " + actual.anterior.dato);
            actual = actual.anterior;
        } while (actual != inicio);

        System.out.println("\nNunca encontraremos null — la lista no tiene extremos.");
    }
}
