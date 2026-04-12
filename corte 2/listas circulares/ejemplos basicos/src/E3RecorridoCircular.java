/**
 * Ejemplo 3: Visualizando la Naturaleza Circular
 *
 * El objetivo de este ejemplo es hacer VISIBLE que la lista no tiene fin.
 * Recorremos la lista más de una vuelta para probar que el último nodo
 * regresa automáticamente al primero.
 *
 * También se compara el bucle "while" (riesgoso) contra el "do-while"
 * (correcto) para recorrer una lista circular.
 */
public class E3RecorridoCircular {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);

        System.out.println("=== LISTA INICIAL ===");
        lista.mostrar();

        // --- RECORRIDO DOBLE: probar que el ciclo es real ---
        System.out.println("\n=== DOS VUELTAS COMPLETAS AL CICLO ===");
        NodoSimple actual = lista.cabeza;
        int vuelta = 1;
        int contador = 0;
        int totalNodos = 4 * 2; // 4 nodos × 2 vueltas

        System.out.print("Vuelta " + vuelta + ": ");
        while (contador < totalNodos) {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
            contador++;

            // Detectar cuando terminamos una vuelta completa
            if (contador == 4 && vuelta == 1) {
                System.out.println("(cabeza)");
                vuelta = 2;
                System.out.print("Vuelta " + vuelta + ": ");
            }
        }
        System.out.println("(cabeza)");

        // --- DEMOSTRACIÓN: ¿qué pasa si usamos while sin control? ---
        System.out.println("\n=== ALERTA: recorrido sin condición de parada ===");
        System.out.println("Un bucle 'while (actual != null)' NUNCA termina en una lista circular.");
        System.out.println("Por eso usamos 'do-while (actual != cabeza)'.");

        // --- RECORRIDO CORRECTO con do-while ---
        System.out.println("\n=== RECORRIDO CORRECTO CON do-while ===");
        actual = lista.cabeza;
        do {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
        } while (actual != lista.cabeza);
        System.out.println("(cabeza)  <- condición de parada cumplida");
    }
}
