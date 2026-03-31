import java.util.Scanner;

/**
 * Ejemplo 1 Interactivo: Estructura del Nodo Doble
 * Permite al usuario crear dos nodos y conectarlos manualmente.
 */
public class E1EstructuraNodoDobleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Creación Manual de Nodos Dobles ---");
        System.out.print("Ingrese el valor para el Nodo A: ");
        NodoDoble nodoA = new NodoDoble(sc.nextInt());
        
        System.out.print("Ingrese el valor para el Nodo B: ");
        NodoDoble nodoB = new NodoDoble(sc.nextInt());

        System.out.println("\nConectando: [A] <-> [B]");
        nodoA.siguiente = nodoB;
        nodoB.anterior = nodoA;

        System.out.println("Verificación:");
        System.out.println("Desde A, el siguiente es: " + nodoA.siguiente.dato);
        System.out.println("Desde B, el anterior es: " + nodoB.anterior.dato);
    }
}
