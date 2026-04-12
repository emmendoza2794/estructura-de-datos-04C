import java.util.Scanner;

/**
 * Ejemplo 1 (Interactivo): Conexión Manual de Nodos Circulares
 *
 * El estudiante ingresa tres valores. El programa crea los nodos,
 * los conecta en ciclo y muestra el resultado paso a paso.
 */
public class E1EstructuraNodoCircularInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CONSTRUCTOR DE CICLO MANUAL ===");
        System.out.println("Ingresa tres valores para crear un ciclo de 3 nodos.\n");

        System.out.print("Valor del Nodo 1: ");
        int v1 = sc.nextInt();
        System.out.print("Valor del Nodo 2: ");
        int v2 = sc.nextInt();
        System.out.print("Valor del Nodo 3: ");
        int v3 = sc.nextInt();

        // Crear y conectar
        NodoSimple nodo1 = new NodoSimple(v1);
        NodoSimple nodo2 = new NodoSimple(v2);
        NodoSimple nodo3 = new NodoSimple(v3);

        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        nodo3.siguiente = nodo1; // Cierre del ciclo

        // Mostrar conexiones
        System.out.println("\n--- Conexiones creadas ---");
        System.out.println("Nodo " + v1 + ".siguiente -> Nodo " + nodo1.siguiente.dato);
        System.out.println("Nodo " + v2 + ".siguiente -> Nodo " + nodo2.siguiente.dato);
        System.out.println("Nodo " + v3 + ".siguiente -> Nodo " + nodo3.siguiente.dato
                + "  (¡cierra el ciclo!)");

        // Recorrido completo
        System.out.println("\n--- Recorrido completo ---");
        NodoSimple actual = nodo1;
        do {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
        } while (actual != nodo1);
        System.out.println("(vuelve a " + v1 + ")");

        sc.close();
    }
}
