/**
 * Ejercicio 1 - Estructura Básica: El Nodo
 * Semana 6: Listas Enlazadas Simples
 *
 * Se demuestra cómo crear nodos individuales de forma manual y cómo
 * conectarlos ("engancharlos") uno con otro para formar una cadena básica.
 */
public class E1EstructuraNodo {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   Demostración: Creación Manual de Nodos");
        System.out.println("==============================================");

        // 1. Creamos tres nodos por separado (son "vagones" sueltos)
        Nodo nodoA = new Nodo(10);
        Nodo nodoB = new Nodo(20);
        Nodo nodoC = new Nodo(30);

        // 2. Conectamos los nodos manualmente (enganchamos los vagones)
        // nodoA apunta a nodoB
        nodoA.siguiente = nodoB;
        // nodoB apunta a nodoC
        nodoB.siguiente = nodoC;
        // nodoC ya tiene su .siguiente como null (indicando el final)

        // 3. Imprimimos el contenido recorriendo manualmente los enlaces
        System.out.println("Nodo A: " + nodoA.dato);
        System.out.println("  ↳ apunta a Nodo B: " + nodoA.siguiente.dato);
        System.out.println("    ↳ apunta a Nodo C: " + nodoB.siguiente.dato);
        System.out.println("      ↳ apunta a: " + nodoC.siguiente); // null

        System.out.println("\nResumen visual:");
        System.out.println("[" + nodoA.dato + "] -> [" + nodoA.siguiente.dato + "] -> [" + nodoB.siguiente.dato + "] -> null");
    }
}
