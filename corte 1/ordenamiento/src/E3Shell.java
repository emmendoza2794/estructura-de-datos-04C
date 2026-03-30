/**
 * Ejercicio 3 - Ordenamiento Shell (Shell Sort)
 * Semana 4: Algoritmos de Ordenamiento
 *
 * El ordenamiento Shell mejora el rendimiento de la inserción 
 * comparando elementos que están a una distancia determinada (gap).
 */
public class E3Shell {
    public static void main(String[] args) {

        // 1. Un arreglo de distancias recorridas (km)
        double[] distancias = {15.2, 3.4, 25.0, 10.5, 7.8, 1.2, 30.6, 5.5};

        System.out.println("==============================================");
        System.out.println("   Ordenamiento Shell - Distancias");
        System.out.println("==============================================");

        // Imprimir el arreglo original
        System.out.print("Original: ");
        imprimirArreglo(distancias);

        // 2. Algoritmo Shell
        int n = distancias.length;

        // Empezar con un gap grande y reducirlo a la mitad en cada paso
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            // Hacer un ordenamiento por inserción para este gap
            for (int i = gap; i < n; i++) {
                double temp = distancias[i];
                int j;
                for (j = i; j >= gap && distancias[j - gap] > temp; j -= gap) {
                    distancias[j] = distancias[j - gap];
                }
                distancias[j] = temp;
            }
        }

        // 3. Resultado final
        System.out.print("Ordenado: ");
        imprimirArreglo(distancias);
    }

    // Método auxiliar para imprimir el arreglo
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
