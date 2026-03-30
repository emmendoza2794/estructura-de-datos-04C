/**
 * Clase ListaEnlazada - Administradora de los Nodos.
 * Se encarga de manejar la "Cabeza" y de realizar las operaciones
 * de inserción y recorrido de forma organizada.
 */
public class ListaEnlazada {
    Nodo cabeza; // El primer nodo de la lista (nuestra locomotora)

    /**
     * Constructor para inicializar una lista vacía.
     */
    public ListaEnlazada() {
        this.cabeza = null;
    }

    /**
     * Método para insertar un nodo al principio de la lista.
     * Esta es la operación más eficiente (O(1)).
     */
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza; // El nuevo nodo abraza a la antigua cabeza
        cabeza = nuevoNodo;           // Ahora el nuevo nodo es el primero
    }

    /**
     * Método para imprimir la lista completa en pantalla.
     * Requiere recorrer todos los nodos desde la cabeza hasta el null.
     */
    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente; // Saltamos al siguiente vagón
        }
        System.out.println("null");
    }
}
