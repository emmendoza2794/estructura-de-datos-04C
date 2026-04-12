/**
 * Clase NodoSimple - La pieza fundamental de una lista circular.
 * Es idéntico al nodo de una lista simple; la "magia circular"
 * no está en el nodo sino en cómo se conectan entre sí.
 */
public class NodoSimple {
    int dato;              // La información almacenada
    NodoSimple siguiente;  // Referencia al siguiente nodo (en el último, apunta a la cabeza)

    /**
     * Constructor para inicializar el nodo con un valor.
     * Al crearse, el nodo no tiene enlace hacia ningún lado.
     */
    public NodoSimple(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
