import java.util.Scanner;

/**
 * Ejercicio 2 (Interactivo) - Implementación de la Lista Enlazada
 * Semana 6: Listas Enlazadas Simples
 *
 * El usuario puede ingresar una serie de números y observar cómo
 * la lista se va formando en tiempo real al insertar al inicio.
 */
public class E2ListaEnlazadaBasicaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("==============================================");
        System.out.println("   Captura de Datos — Generador de Listas");
        System.out.println("==============================================");

        System.out.print("¿Cuántos números deseas agregar a la lista? ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el valor para el nodo " + (i + 1) + ": ");
            int valor = sc.nextInt();
            
            // Insertamos en la lista
            lista.insertarAlInicio(valor);
            
            // Mostramos el estado actual
            System.out.print("  ↳ Lista actual: ");
            lista.imprimirLista();
        }

        System.out.println("\n¡Lista finalizada!");
        System.out.println("Has creado una cadena de " + cantidad + " nodos dinámicamente.");
    }
}
