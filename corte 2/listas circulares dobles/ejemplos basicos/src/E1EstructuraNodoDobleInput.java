import java.util.Scanner;

/**
 * Ejemplo 1 Interactivo: Estructura del Nodo Doble Circular
 * El usuario ingresa 3 valores enteros. Se crean los nodos, se conectan
 * manualmente formando el ciclo doble y se muestra el recorrido completo.
 */
public class E1EstructuraNodoDobleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Nodo Doble Circular — Entrada Manual ===");
        System.out.print("Ingresa el valor del nodo 1: ");
        int v1 = sc.nextInt();
        System.out.print("Ingresa el valor del nodo 2: ");
        int v2 = sc.nextInt();
        System.out.print("Ingresa el valor del nodo 3: ");
        int v3 = sc.nextInt();

        NodoDoble nodo1 = new NodoDoble(v1);
        NodoDoble nodo2 = new NodoDoble(v2);
        NodoDoble nodo3 = new NodoDoble(v3);

        // Conexiones hacia adelante
        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        nodo3.siguiente = nodo1;

        // Conexiones hacia atrás
        nodo1.anterior = nodo3;
        nodo2.anterior = nodo1;
        nodo3.anterior = nodo2;

        // Verificación del ciclo
        System.out.println("\n=== Verificación del ciclo doble ===");
        System.out.println("nodo3.siguiente == nodo1: " + (nodo3.siguiente == nodo1));
        System.out.println("nodo1.anterior  == nodo3: " + (nodo1.anterior == nodo3));

        // Recorrido hacia adelante
        System.out.println("\n=== Recorrido hacia adelante ===");
        NodoDoble actual = nodo1;
        do {
            System.out.println("  dato: " + actual.dato
                    + "  | anterior: " + actual.anterior.dato
                    + "  | siguiente: " + actual.siguiente.dato);
            actual = actual.siguiente;
        } while (actual != nodo1);

        // Recorrido hacia atrás desde nodo3
        System.out.println("\n=== Recorrido hacia atrás ===");
        actual = nodo3;
        NodoDoble inicio = actual;
        do {
            System.out.println("  dato: " + actual.dato
                    + "  | siguiente: " + actual.siguiente.dato
                    + "  | anterior: " + actual.anterior.dato);
            actual = actual.anterior;
        } while (actual != inicio);

        sc.close();
    }
}
