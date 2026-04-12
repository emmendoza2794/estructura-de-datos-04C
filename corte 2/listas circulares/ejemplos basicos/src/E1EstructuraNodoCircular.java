/**
 * Ejemplo 1: Estructura del Nodo Circular (Demostración Manual)
 *
 * Creamos tres nodos y los conectamos a mano para entender
 * la diferencia clave respecto a la lista simple:
 * el último nodo NO apunta a null, sino de regreso al primero.
 */
public class E1EstructuraNodoCircular {
    public static void main(String[] args) {

        // 1. Crear tres nodos aislados
        NodoSimple nodo1 = new NodoSimple(10);
        NodoSimple nodo2 = new NodoSimple(20);
        NodoSimple nodo3 = new NodoSimple(30);

        // 2. Conectarlos en cadena
        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;

        // 3. Cerrar el ciclo: el último apunta al primero
        nodo3.siguiente = nodo1; // <-- ¡Aquí está la diferencia!

        // 4. Verificar la estructura
        System.out.println("=== NODO POR NODO ===");
        System.out.println("Nodo 1 : " + nodo1.dato);
        System.out.println("Nodo 2 : " + nodo2.dato + "  (accedido desde nodo1.siguiente)");
        System.out.println("Nodo 3 : " + nodo3.dato + "  (accedido desde nodo2.siguiente)");

        System.out.println("\n=== VERIFICANDO EL CICLO ===");
        System.out.println("nodo3.siguiente.dato = " + nodo3.siguiente.dato
                + "  <-- ¡Es el nodo 1 otra vez! No es null.");

        // 5. Recorrer una vuelta completa partiendo desde nodo1
        System.out.println("\n=== RECORRIDO DE UNA VUELTA COMPLETA ===");
        NodoSimple actual = nodo1;
        do {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
        } while (actual != nodo1);
        System.out.println("(vuelve a " + nodo1.dato + ")");
    }
}
