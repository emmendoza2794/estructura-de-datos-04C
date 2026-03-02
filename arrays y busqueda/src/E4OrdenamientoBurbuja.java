/**
 * Ejercicio 4 - Ordenamiento Burbuja (Bubble Sort)
 * Semana 3: Arreglos y Búsqueda
 *
 * El ordenamiento es fundamental para algoritmos más eficientes como
 * la búsqueda binaria. Aquí se demuestra el método de la burbuja.
 */
public class E4OrdenamientoBurbuja {
    public static void main(String[] args) {

        // 1. Un arreglo de notas desordenadas
        double[] notas = {4.5, 3.2, 5.0, 2.8, 4.0, 1.5};

        System.out.println("==============================================");
        System.out.println("   Ordenamiento de Notas Académicas");
        System.out.println("==============================================");

        // Imprimir el arreglo original
        System.out.print("Original: ");
        imprimirArreglo(notas);

        // 2. Algoritmo de la Burbuja
        // n-1 pasadas
        int n = notas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Si el de la izquierda es mayor, se intercambian
                if (notas[j] > notas[j + 1]) {
                    // Intercambio (swap) usando una variable temporal
                    double temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }

        // 3. Resultado final
        System.out.print("Ordenado: ");
        imprimirArreglo(notas);
    }

    // Método auxiliar para imprimir el arreglo
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
