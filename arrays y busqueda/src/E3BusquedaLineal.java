/**
 * Ejercicio 3 - Búsqueda Lineal
 * Semana 3: Arreglos y Búsqueda
 *
 * Se demuestra el algoritmo de búsqueda más simple: recorrer
 * el arreglo secuencialmente hasta encontrar el elemento buscado.
 */
public class E3BusquedaLineal {
    public static void main(String[] args) {

        // 1. Inventario de productos (arreglo desordenado)
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor", "Impresora", "Scanner"};

        // 2. Elemento que deseamos buscar
        String buscado = "Monitor";

        System.out.println("==============================================");
        System.out.println("   Búsqueda de Producto: " + buscado);
        System.out.println("==============================================");

        boolean encontrado = false;
        int posicion = -1;

        // 3. Algoritmo de Búsqueda Lineal
        for (int i = 0; i < productos.length; i++) {
            // Se usa .equals para comparar el contenido de los Strings
            if (productos[i].equalsIgnoreCase(buscado)) {
                encontrado = true;
                posicion = i;
                break; // Terminamos el ciclo apenas lo encontramos
            }
        }

        // 4. Resultado del reporte
        if (encontrado) {
            System.out.println("✅ El producto '" + buscado + "' se encuentra en stock.");
            System.out.println("📍 Ubicación (Índice): " + posicion);
        } else {
            System.out.println("❌ El producto '" + buscado + "' no está registrado.");
        }
    }
}
