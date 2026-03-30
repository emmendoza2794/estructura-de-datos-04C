/**
 * Ejercicio 2 - Variables por referencia
 * Semana 1 y 2: Elementos del lenguaje, generalidades y conceptos básicos
 *
 * En Java, los tipos primitivos se pasan por VALOR y los objetos por REFERENCIA.
 * Este ejercicio muestra la diferencia entre ambos comportamientos.
 */
public class E2VariablesPorReferencia {
    public static void main(String[] args) {

        // --- Por valor (tipos primitivos) ---
        int a = 10;
        int b = a; // b recibe una COPIA del valor de a
        b = 99;

        System.out.println("=== Por valor (primitivos) ===");
        System.out.println("a = " + a); // sigue siendo 10
        System.out.println("b = " + b); // es 99

        // --- Por referencia (objetos) ---
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = arreglo1; // arreglo2 apunta al MISMO objeto en memoria
        arreglo2[0] = 999;

        System.out.println("\n=== Por referencia (objetos/arreglos) ===");
        System.out.println("arreglo1[0] = " + arreglo1[0]); // también cambió a 999
        System.out.println("arreglo2[0] = " + arreglo2[0]); // 999

        // --- Con String (inmutable, comportamiento especial) ---
        String s1 = "Hola";
        String s2 = s1;
        s2 = "Adiós"; // String crea un nuevo objeto, no modifica el original

        System.out.println("\n=== Con String (inmutable) ===");
        System.out.println("s1 = " + s1); // sigue siendo "Hola"
        System.out.println("s2 = " + s2); // es "Adiós"
    }
}
