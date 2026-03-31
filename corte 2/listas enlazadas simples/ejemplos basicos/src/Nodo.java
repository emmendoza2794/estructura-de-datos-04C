/**
 * Clase Nodo - La pieza fundamental de una lista enlazada simple.
 * Un nodo actúa como un "vagón" que contiene un dato y una "flecha" 
 * (referencia) al siguiente nodo de la cadena.
 */
public class Nodo {
    int dato;       // La información que queremos guardar (ej: un número)
    Nodo siguiente; // Referencia al próximo nodo (nuestro "hilo" conductor)

    /**
     * Constructor para inicializar el nodo con un valor.
     * Al nacer, el nodo no tiene un "siguiente" todavía (es null).
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
