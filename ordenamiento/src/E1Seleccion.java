/**
 * Ejercicio 1 - Ordenamiento por Selección (Selection Sort)
 * Semana 4: Algoritmos de Ordenamiento
 *
 * El ordenamiento por selección busca repetidamente el elemento mínimo 
 * de la parte no ordenada y lo coloca al principio.
 */
public class E1Seleccion {
    public static void main(String[] args) {

        // 1. Un arreglo de precios de productos desordenados
        double[] precios = {120.50, 45.00, 89.90, 15.50, 200.00, 32.10};

        System.out.println("==============================================");
        System.out.println("   Ordenamiento por Selección - Precios");
        System.out.println("==============================================");

        // Imprimir el arreglo original
        System.out.print("Original: ");
        imprimirArreglo(precios);

        // 2. Algoritmo de Selección
        int n = precios.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del mínimo en el resto del arreglo
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (precios[j] < precios[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar el mínimo encontrado con el primer elemento
            double temp = precios[indiceMinimo];
            precios[indiceMinimo] = precios[i];
            precios[i] = temp;
        }

        // 3. Resultado final
        System.out.print("Ordenado: ");
        imprimirArreglo(precios);
    }

    // Método auxiliar para imprimir el arreglo
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
