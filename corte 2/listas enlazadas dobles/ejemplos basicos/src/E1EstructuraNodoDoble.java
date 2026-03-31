/**
 * Ejemplo 1: Estructura del Nodo Doble
 * En este ejemplo creamos tres nodos manualmente y los conectamos 
 * en ambas direcciones para entender cómo funciona el enlace doble.
 */
public class E1EstructuraNodoDoble {
    public static void main(String[] args) {
        // 1. Crear tres nodos aislados
        NodoDoble nodo1 = new NodoDoble(10);
        NodoDoble nodo2 = new NodoDoble(20);
        NodoDoble nodo3 = new NodoDoble(30);

        // 2. Conectarlos manualmente (Simulando la lista)
        // Conexiones de ida (siguiente)
        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;

        // Conexiones de vuelta (anterior) - ¡Esto es lo nuevo!
        nodo2.anterior = nodo1;
        nodo3.anterior = nodo2;

        // 3. Demostración de recorrido en ambas direcciones
        System.out.println("--- Recorrido hacia adelante ---");
        System.out.println("Nodo 1: " + nodo1.dato);
        System.out.println("Nodo 2 (vía 1): " + nodo1.siguiente.dato);
        System.out.println("Nodo 3 (vía 2): " + nodo1.siguiente.siguiente.dato);

        System.out.println("\n--- Recorrido hacia atrás ---");
        System.out.println("Nodo 3: " + nodo3.dato);
        System.out.println("Nodo 2 (vía 3): " + nodo3.anterior.dato);
        System.out.println("Nodo 1 (vía 2): " + nodo3.anterior.anterior.dato);
    }
}
