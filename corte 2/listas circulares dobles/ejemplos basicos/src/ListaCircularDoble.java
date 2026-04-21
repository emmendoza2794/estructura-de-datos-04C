public class ListaCircularDoble {
    NodoDoble cabeza;
    NodoDoble cola;

    public ListaCircularDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (cabeza == null) {
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
    }

    public void insertarAlInicio(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (cabeza == null) {
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            nuevo.anterior = cola;
            cola.siguiente = nuevo;
            cabeza = nuevo;
        }
    }

    public void eliminar(int valor) {
        if (cabeza == null) return;

        NodoDoble actual = cabeza;
        do {
            if (actual.dato == valor) {
                if (actual.siguiente == actual) {
                    cabeza = null;
                    cola = null;
                    return;
                }
                // O(1) gracias al puntero anterior — no necesitamos buscar el nodo previo
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
                if (actual == cabeza) cabeza = actual.siguiente;
                if (actual == cola) cola = actual.anterior;
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public void mostrarAdelante() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }
        NodoDoble actual = cabeza;
        do {
            System.out.print("[" + actual.dato + "] <-> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(cabeza)");
    }

    public void mostrarAtras() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }
        NodoDoble actual = cola;
        do {
            System.out.print("[" + actual.dato + "] <-> ");
            actual = actual.anterior;
        } while (actual != cola);
        System.out.println("(cola)");
    }

    public boolean buscar(int valor) {
        if (cabeza == null) return false;
        NodoDoble actual = cabeza;
        do {
            if (actual.dato == valor) return true;
            actual = actual.siguiente;
        } while (actual != cabeza);
        return false;
    }

    public int tamanio() {
        if (cabeza == null) return 0;
        int contador = 0;
        NodoDoble actual = cabeza;
        do {
            contador++;
            actual = actual.siguiente;
        } while (actual != cabeza);
        return contador;
    }
}
