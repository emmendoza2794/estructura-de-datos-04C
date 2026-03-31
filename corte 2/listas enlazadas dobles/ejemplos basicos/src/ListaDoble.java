/**
 * Clase ListaDoble - Administradora de los Nodos Dobles.
 * Maneja tanto la "Cabeza" (inicio) como la "Cola" (fin) para mayor eficiencia.
 * Permite recorridos en ambas direcciones: de principio a fin y viceversa.
 */
public class ListaDoble {
    NodoDoble cabeza; // El primer nodo de la lista
    NodoDoble cola;   // El último nodo de la lista (opcional, pero muy útil)

    /**
     * Constructor para inicializar una lista doble vacía.
     */
    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    /**
     * Inserta un nodo al inicio de la lista.
     */
    public void insertarAlInicio(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    /**
     * Inserta un nodo al final de la lista.
     */
    public void insertarAlFinal(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (cola == null) {
            cabeza = cola = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    /**
     * Imprime la lista desde la cabeza hasta la cola.
     */
    public void imprimirAdelante() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        NodoDoble actual = cabeza;
        System.out.print("Adelante: null <- ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.siguiente != null) System.out.print(" <-> ");
            actual = actual.siguiente;
        }
        System.out.println(" -> null");
    }

    /**
     * Imprime la lista desde la cola hasta la cabeza.
     */
    public void imprimirAtras() {
        if (cola == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        NodoDoble actual = cola;
        System.out.print("Atrás: null <- ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.anterior != null) System.out.print(" <-> ");
            actual = actual.anterior;
        }
        System.out.println(" -> null");
    }
}
