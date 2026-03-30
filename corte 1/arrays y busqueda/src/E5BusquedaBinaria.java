/**
 * Ejercicio 5 - Búsqueda Binaria
 * Semana 3: Arreglos y Búsqueda
 *
 * La búsqueda binaria es un algoritmo eficiente para encontrar un elemento
 * en un arreglo ordenado, dividiendo el espacio de búsqueda a la mitad
 * en cada paso (Logarítmico).
 */
public class E5BusquedaBinaria {
    public static void main(String[] args) {

        // 1. Arreglo ya ordenado (es requisito fundamental)
        int[] codigosLibros = {1001, 1050, 1100, 1205, 1310, 1400, 1502, 2000, 2500};

        // 2. Elemento a buscar
        int buscado = 1502;

        System.out.println("==============================================");
        System.out.println("   Buscador Eficiente (Búsqueda Binaria)");
        System.out.println("   Buscando código: " + buscado);
        System.out.println("==============================================");

        int inicio = 0;
        int fin = codigosLibros.length - 1;
        int pasos = 0;
        int posicionEncontrada = -1;

        // 3. Algoritmo de Búsqueda Binaria
        while (inicio <= fin) {
            pasos++;
            int medio = inicio + (fin - inicio) / 2;

            // ¿Está en el medio?
            if (codigosLibros[medio] == buscado) {
                posicionEncontrada = medio;
                break;
            }

            // Si el valor del medio es menor, buscamos a la derecha
            if (codigosLibros[medio] < buscado) {
                inicio = medio + 1;
            }
            // Si el valor del medio es mayor, buscamos a la izquierda
            else {
                fin = medio - 1;
            }
        }

        // 4. Reporte final
        if (posicionEncontrada != -1) {
            System.out.println("✅ Libro encontrado!");
            System.out.println("📍 Posición en el sistema: " + posicionEncontrada);
            System.out.println("⚡ Eficiencia: encontrado en " + pasos + " divisiones.");
        } else {
            System.out.println("❌ El código " + buscado + " no existe en la biblioteca.");
            System.out.println("⚠️ Se agotaron los " + pasos + " pasos de búsqueda.");
        }
    }
}
