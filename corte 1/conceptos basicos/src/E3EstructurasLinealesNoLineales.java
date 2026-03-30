/**
 * Ejercicio 3 - Estructuras de datos lineales y no lineales
 * Semana 1 y 2: Elementos del lenguaje, generalidades y conceptos básicos
 *
 * Estructuras LINEALES: los elementos se organizan en secuencia (uno tras otro).
 *   Ejemplos: arreglos, listas, pilas, colas.
 *
 * Estructuras NO LINEALES: los elementos se relacionan de forma jerárquica o en red.
 *   Ejemplos: árboles, grafos.
 *
 * En este ejercicio se muestra un arreglo (lineal) y se simula
 * una estructura jerárquica simple (no lineal) con objetos.
 */
public class E3EstructurasLinealesNoLineales {

    // Nodo simple para representar una estructura no lineal (árbol binario)
    static class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(int valor) {
            this.valor = valor;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    public static void main(String[] args) {

        // === Estructura LINEAL: Arreglo ===
        System.out.println("=== Estructura lineal: Arreglo ===");
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // === Estructura NO LINEAL: Árbol binario simple ===
        System.out.println("\n=== Estructura no lineal: Árbol binario ===");

        Nodo raiz = new Nodo(1);
        raiz.izquierdo = new Nodo(2);
        raiz.derecho = new Nodo(3);
        raiz.izquierdo.izquierdo = new Nodo(4);
        raiz.izquierdo.derecho = new Nodo(5);

        /*
         * Árbol resultante:
         *         1
         *        / \
         *       2   3
         *      / \
         *     4   5
         */

        System.out.println("Raíz: " + raiz.valor);
        System.out.println("Hijo izquierdo: " + raiz.izquierdo.valor);
        System.out.println("Hijo derecho: " + raiz.derecho.valor);
        System.out.println("Nieto izquierdo-izquierdo: " + raiz.izquierdo.izquierdo.valor);
        System.out.println("Nieto izquierdo-derecho: " + raiz.izquierdo.derecho.valor);
    }
}
