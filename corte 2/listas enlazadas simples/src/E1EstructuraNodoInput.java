import java.util.Scanner;

/**
 * Ejercicio 1 (Interactivo) - Estructura Básica: El Nodo
 * Semana 6: Listas Enlazadas Simples
 *
 * El usuario puede crear sus propios nodos manualmente para practicar
 * la asignación de referencias y entender que los nodos son objetos
 * independientes que se unen a través de punteros.
 */
public class E1EstructuraNodoInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Captura de Datos - Creando Nodos sueltos");
        System.out.println("==============================================");

        // Pedimos dos números para dos nodos
        System.out.print("Ingresa el valor para el Nodo A: ");
        int valorA = sc.nextInt();
        Nodo nodoA = new Nodo(valorA);

        System.out.print("Ingresa el valor para el Nodo B: ");
        int valorB = sc.nextInt();
        Nodo nodoB = new Nodo(valorB);

        // Explicación de lo que pasa en memoria
        System.out.println("\nEstado inicial:");
        System.out.println("Nodo A [" + nodoA.dato + "] apunta a: " + nodoA.siguiente);
        System.out.println("Nodo B [" + nodoB.dato + "] apunta a: " + nodoB.siguiente);

        // El usuario decide si quiere conectarlos
        System.out.print("\n¿Quieres conectar el Nodo A al Nodo B? (S/N): ");
        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("S")) {
            nodoA.siguiente = nodoB;
            System.out.println("\n¡Conectados con éxito!");
            System.out.println("Ahora Nodo A [" + nodoA.dato + "] apunta al valor de Nodo B [" + nodoA.siguiente.dato + "]");
        } else {
            System.out.println("\nLos nodos se quedaron sueltos.");
        }

        System.out.println("\nGracias por participar en la simulación de memoria.");
    }
}
