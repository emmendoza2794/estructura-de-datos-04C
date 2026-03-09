/**
 * Ejercicio 2 - Ordenamiento por Inserción (Insertion Sort)
 * Semana 4: Algoritmos de Ordenamiento
 *
 * El ordenamiento por inserción construye una lista ordenada de uno en uno, 
 * insertando cada elemento en su lugar correcto. Es similar a cómo se ordenan cartas.
 */
public class E2Insercion {
    public static void main(String[] args) {

        // 1. Edades de un grupo de estudiantes
        int[] edades = {21, 19, 25, 18, 20, 22, 17};

        System.out.println("==============================================");
        System.out.println("   Ordenamiento por Inserción - Edades");
        System.out.println("==============================================");

        // Imprimir el arreglo original
        System.out.print("Original: ");
        imprimirArreglo(edades);

        // 2. Algoritmo de Inserción
        int n = edades.length;
        for (int i = 1; i < n; i++) {
            int clave = edades[i];
            int j = i - 1;

            /* Mover los elementos de edades[0..i-1] que son
               mayores que la clave, a una posición adelante
               de su posición actual */
            while (j >= 0 && edades[j] > clave) {
                edades[j + 1] = edades[j];
                j = j - 1;
            }
            edades[j + 1] = clave;
        }

        // 3. Resultado final
        System.out.print("Ordenado: ");
        imprimirArreglo(edades);
    }

    // Método auxiliar para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }
}
