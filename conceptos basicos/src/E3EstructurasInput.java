import java.util.Scanner;

/**
 * Ejercicio 3 (Interactivo) - Estructuras lineales y no lineales
 * Semana 1 y 2: Elementos del lenguaje, generalidades y conceptos básicos
 *
 * El usuario llena un arreglo con datos reales (estructura lineal)
 * y luego se construye un árbol de categorías fijo (estructura no lineal)
 * para comparar visualmente ambos tipos.
 *
 * Estructura LINEAL  → arreglo: acceso por índice, elementos en secuencia.
 * Estructura NO LINEAL → árbol: relaciones jerárquicas entre nodos.
 */
public class E3EstructurasInput {

    // Nodo para el árbol de categorías (estructura no lineal)
    static class NodoCategoria {
        String nombre;
        NodoCategoria izquierdo;
        NodoCategoria derecho;

        NodoCategoria(String nombre) {
            this.nombre = nombre;
            // Los hijos comienzan en null: aún no tiene ramas
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("  Estructuras Lineales vs No Lineales");
        System.out.println("==============================================");

        // ============================================================
        // PARTE 1 — Estructura LINEAL: arreglo (lista de precios)
        // ============================================================
        System.out.println("\n--- PARTE 1: Estructura LINEAL (arreglo) ---");
        System.out.print("¿Cuántos productos quieres registrar? (máx 6): ");
        int cantidad = sc.nextInt();
        if (cantidad > 6) cantidad = 6; // limitamos para el ejemplo

        // El arreglo es lineal: cada elemento tiene un índice consecutivo
        String[] productos  = new String[cantidad];
        double[] precios    = new double[cantidad];

        sc.nextLine(); // limpiar buffer
        for (int i = 0; i < cantidad; i++) {
            System.out.print("  Nombre del producto " + (i + 1) + ": ");
            productos[i] = sc.nextLine();
            System.out.print("  Precio: ");
            precios[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Recorrido secuencial: accedemos uno tras otro por índice
        System.out.println("\n  Lista de productos (recorrido lineal):");
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("  [%d] %-20s $%.2f%n", i, productos[i], precios[i]);
            total += precios[i];
        }
        System.out.printf("  Total inventario: $%.2f%n", total);
        System.out.println("  → Los elementos están EN SECUENCIA. Acceso directo por índice.");

        // ============================================================
        // PARTE 2 — Estructura NO LINEAL: árbol de categorías
        // ============================================================
        System.out.println("\n--- PARTE 2: Estructura NO LINEAL (árbol de categorías) ---");
        System.out.println("  Construyendo árbol de categorías de una tienda...\n");

        /*
         * Árbol que se construye:
         *
         *             Tienda
         *            /      \
         *       Ropa        Tecnología
         *      /    \         /     \
         *  Hombre  Mujer  Celulares Computadores
         */

        // Raíz del árbol
        NodoCategoria raiz = new NodoCategoria("Tienda");

        // Primer nivel de hijos
        raiz.izquierdo = new NodoCategoria("Ropa");
        raiz.derecho   = new NodoCategoria("Tecnología");

        // Segundo nivel de hijos (hojas del árbol)
        raiz.izquierdo.izquierdo = new NodoCategoria("Hombre");
        raiz.izquierdo.derecho   = new NodoCategoria("Mujer");
        raiz.derecho.izquierdo   = new NodoCategoria("Celulares");
        raiz.derecho.derecho     = new NodoCategoria("Computadores");

        // Recorrido manual mostrando la jerarquía con sangría
        System.out.println("  Nivel 0 (raíz):    " + raiz.nombre);
        System.out.println("  Nivel 1 (hijos):   " + raiz.izquierdo.nombre
                                            + "  |  " + raiz.derecho.nombre);
        System.out.println("  Nivel 2 (hojas):   "
                + raiz.izquierdo.izquierdo.nombre + "  "
                + raiz.izquierdo.derecho.nombre + "  "
                + raiz.derecho.izquierdo.nombre + "  "
                + raiz.derecho.derecho.nombre);

        System.out.println("\n  → Los elementos NO están en secuencia.");
        System.out.println("    Cada nodo puede tener hijos: la relación es JERÁRQUICA.");

        // ============================================================
        // COMPARACIÓN FINAL
        // ============================================================
        System.out.println("\n============ Comparación ============");
        System.out.println("  LINEAL (arreglo)");
        System.out.println("    - Elementos en secuencia");
        System.out.println("    - Acceso por índice: O(1)");
        System.out.println("    - Ej: lista de productos, cola de turnos");
        System.out.println();
        System.out.println("  NO LINEAL (árbol)");
        System.out.println("    - Elementos con relación padre → hijos");
        System.out.println("    - Acceso navegando por ramas");
        System.out.println("    - Ej: categorías, jerarquía de empleados, sistema de archivos");

        sc.close();
    }
}
