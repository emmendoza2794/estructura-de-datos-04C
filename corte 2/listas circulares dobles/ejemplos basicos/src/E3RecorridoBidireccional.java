/**
 * Ejemplo 3: Recorrido Bidireccional en Lista Circular Doble.
 * Demo sin Scanner. Ilustra que la lista no tiene extremos:
 * podemos dar múltiples vueltas en cualquier dirección sin encontrar null.
 */
public class E3RecorridoBidireccional {
    public static void main(String[] args) {
        ListaCircularDoble lista = new ListaCircularDoble();
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);
        lista.insertarAlFinal(50);

        System.out.println("=== E3: Recorrido Bidireccional ===");
        System.out.println("Lista base:");
        lista.mostrarAdelante();

        // 1. Dos vueltas hacia adelante usando un contador
        System.out.println("\n--- Dos vueltas hacia adelante (10 pasos) ---");
        NodoDoble actual = lista.cabeza;
        int totalNodos = lista.tamanio();
        int pasos = totalNodos * 2; // exactamente dos vueltas

        for (int i = 0; i < pasos; i++) {
            System.out.print("[" + actual.dato + "]");
            if (i < pasos - 1) System.out.print(" -> ");
            actual = actual.siguiente;
        }
        System.out.println();
        System.out.println("  Vuelta 1 terminó en el nodo " + totalNodos + ", Vuelta 2 también — ¡sin null!");

        // 2. Dos vueltas hacia atrás desde la cola
        System.out.println("\n--- Dos vueltas hacia atrás (10 pasos desde la cola) ---");
        actual = lista.cola;

        for (int i = 0; i < pasos; i++) {
            System.out.print("[" + actual.dato + "]");
            if (i < pasos - 1) System.out.print(" -> ");
            actual = actual.anterior;
        }
        System.out.println();

        // 3. Demostrar que cola.siguiente == cabeza (nunca null)
        System.out.println("\n--- Verificación: los extremos se enlazan entre sí ---");
        System.out.println("  cabeza.dato            = " + lista.cabeza.dato);
        System.out.println("  cola.dato              = " + lista.cola.dato);
        System.out.println("  cola.siguiente.dato    = " + lista.cola.siguiente.dato + "  <-- regresa a cabeza");
        System.out.println("  cabeza.anterior.dato   = " + lista.cabeza.anterior.dato + "  <-- apunta a cola");
        System.out.println("\n  En una lista circular doble NUNCA encontrarás null.");
        System.out.println("  Los extremos se enlazan formando un ciclo en ambas direcciones.");
    }
}
