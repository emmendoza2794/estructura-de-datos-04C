public class PilaContenedores {
    private Contenedor tope;
    private int tamanio;

    public PilaContenedores() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(Contenedor nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Contenedor pop() {
        if (estaVacia()) {
            return null;
        }
        Contenedor aux = tope;
        tope = tope.siguiente;
        tamanio--;
        aux.siguiente = null; // Limpiar referencia para seguridad
        return aux;
    }

    public Contenedor peek() {
        return tope;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Contenedor actual = tope;
        System.out.println("=== ESTADO DEL MUELLE (De Tope a Base) ===");
        while (actual != null) {
            if (actual == tope) {
                System.out.print("  TOPE -> ");
            } else {
                System.out.print("          ");
            }
            System.out.println(actual.toString());
            actual = actual.siguiente;
        }
        System.out.println("===========================================");
    }

    /**
     * Cuenta cuántos contenedores pertenecen a una empresa específica recorriendo la pila.
     */
    public int contarPorEmpresa(String nombreEmpresa) {
        int contador = 0;
        Contenedor actual = tope;
        while (actual != null) {
            if (actual.empresa.equalsIgnoreCase(nombreEmpresa)) {
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }
}
