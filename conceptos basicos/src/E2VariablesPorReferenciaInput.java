import java.util.Scanner;

/**
 * Ejercicio 2 (Interactivo) - Variables por referencia
 * Semana 1 y 2: Elementos del lenguaje, generalidades y conceptos básicos
 *
 * El usuario ingresa valores para ver en tiempo real la diferencia entre
 * pasar datos POR VALOR (primitivos) y POR REFERENCIA (objetos/arreglos).
 *
 * Conceptos demostrados:
 *   - Por VALOR: se copia el dato, el original no cambia.
 *   - Por REFERENCIA: ambas variables apuntan al mismo objeto en memoria.
 *   - String es inmutable: aunque es objeto, no se modifica el original.
 */
public class E2VariablesPorReferenciaInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Variables: por Valor vs por Referencia");
        System.out.println("==============================================");

        // ============================================================
        // PARTE 1 — Por VALOR (tipos primitivos: int, double, etc.)
        // ============================================================
        System.out.println("\n--- PARTE 1: Por VALOR (tipo int) ---");
        System.out.print("Ingresa el stock actual de un producto (número entero): ");
        int stockOriginal = sc.nextInt();

        // Se copia el VALOR, no la dirección de memoria
        int stockCopia = stockOriginal;

        System.out.print("Ingresa cuántas unidades se vendieron: ");
        int vendidas = sc.nextInt();

        // Modificamos la copia, el original no se ve afectado
        stockCopia = stockCopia - vendidas;

        System.out.println("\nResultado:");
        System.out.println("  stockOriginal = " + stockOriginal
                + "  ← no cambió, porque int se pasa por VALOR");
        System.out.println("  stockCopia    = " + stockCopia
                + "  ← esta sí cambió");

        // ============================================================
        // PARTE 2 — Por REFERENCIA (arreglos)
        // ============================================================
        System.out.println("\n--- PARTE 2: Por REFERENCIA (arreglo) ---");
        System.out.println("Ingresa las notas de 3 estudiantes:");

        // El arreglo vive en el Heap; 'notas' guarda la dirección de memoria
        double[] notas = new double[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("  Nota estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // notasCoordinador apunta al MISMO arreglo en memoria
        double[] notasCoordinador = notas;

        System.out.print("\nEl coordinador corrige la nota del estudiante 1. Nueva nota: ");
        double notaCorregida = sc.nextDouble();
        notasCoordinador[0] = notaCorregida; // modifica el arreglo original también

        System.out.println("\nNotas después de la corrección del coordinador:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("  notas[" + i + "] = " + notas[i]);
        }
        System.out.println("→ notas[0] cambió a " + notas[0]
                + " porque 'notasCoordinador' y 'notas' apuntan al MISMO objeto en memoria.");

        // ============================================================
        // PARTE 3 — String (inmutable)
        // ============================================================
        System.out.println("\n--- PARTE 3: String (inmutable) ---");
        System.out.print("Ingresa el mensaje original: ");
        sc.nextLine(); // limpia el buffer después de nextDouble
        String mensajeOriginal = sc.nextLine();

        // String crea un NUEVO objeto en memoria al reasignar
        String mensajeEditado = mensajeOriginal;

        System.out.print("Ingresa el mensaje editado: ");
        mensajeEditado = sc.nextLine(); // reasignar crea un nuevo String, no modifica el original

        System.out.println("\nResultado:");
        System.out.println("  mensajeOriginal = \"" + mensajeOriginal
                + "\"  ← no cambió, String es inmutable");
        System.out.println("  mensajeEditado  = \"" + mensajeEditado
                + "\"  ← apunta a un nuevo objeto String");

        sc.close();
    }
}
