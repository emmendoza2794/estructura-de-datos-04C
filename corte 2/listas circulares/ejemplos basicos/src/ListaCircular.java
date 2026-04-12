/**
 * Clase ListaCircular - Administradora de los NodoSimples en ciclo cerrado.
 * Mantiene un puntero a la "cabeza" (inicio) y otro a la "cola" (último nodo)
 * para que la inserción al final sea O(1) sin necesidad de recorrer toda la lista.
 *
 * Invariante clave: cola.siguiente == cabeza (siempre que la lista no esté vacía).
 */
public class ListaCircular {
    NodoSimple cabeza; // El primer nodo de la lista
    NodoSimple cola;   // El último nodo; cola.siguiente siempre apunta a cabeza

    public ListaCircular() {
        this.cabeza = null;
        this.cola = null;
    }

    /** Inserta un nuevo nodo al final del ciclo. */
    public void insertarAlFinal(int dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        if (cabeza == null) {
            // Lista vacía: el nodo se apunta a sí mismo
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    /** Inserta un nuevo nodo al inicio del ciclo. */
    public void insertarAlInicio(int dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            nuevo.siguiente = cabeza;
            cola.siguiente = nuevo; // El último sigue apuntando a la nueva cabeza
            cabeza = nuevo;
        }
    }

    /** Elimina el primer nodo que contenga el valor indicado. */
    public void eliminar(int valor) {
        if (cabeza == null) return;

        // Caso: el nodo a borrar es la cabeza
        if (cabeza.dato == valor) {
            if (cabeza == cola) {
                // Era el único nodo
                cabeza = null;
                cola = null;
            } else {
                cabeza = cabeza.siguiente;
                cola.siguiente = cabeza;
            }
            return;
        }

        // Caso: el nodo está en el interior o es la cola
        NodoSimple anterior = cabeza;
        NodoSimple actual = cabeza.siguiente;
        while (actual != cabeza) {
            if (actual.dato == valor) {
                anterior.siguiente = actual.siguiente;
                if (actual == cola) {
                    cola = anterior;
                }
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    }

    /** Recorre e imprime todos los nodos del ciclo. */
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        NodoSimple actual = cabeza;
        do {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(cabeza)");
    }

    /** Devuelve true si la lista no tiene nodos. */
    public boolean estaVacia() {
        return cabeza == null;
    }
}
