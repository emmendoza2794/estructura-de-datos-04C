/**
 * Clase NodoDoble - La pieza fundamental de una lista enlazada doble.
 * A diferencia de la simple, este "vagón" tiene dos "flechas" (referencias):
 * una apunta al siguiente nodo y otra al nodo anterior.
 */
public class NodoDoble {
    int dato;           // La información que queremos guardar
    NodoDoble siguiente; // Referencia al próximo nodo
    NodoDoble anterior;  // Referencia al nodo previo (¡La gran diferencia!)

    /**
     * Constructor para inicializar el nodo con un valor.
     * Al nacer, el nodo no tiene ni siguiente ni anterior (ambos null).
     */
    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
