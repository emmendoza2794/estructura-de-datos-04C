/**
 * Ejemplo 2: Operaciones de inserción y eliminación en lista circular doble.
 * Demo automática — sin Scanner. Muestra el estado de la lista
 * adelante y atrás después de cada operación.
 */
public class E2OperacionesDoble {
    public static void main(String[] args) {
        ListaCircularDoble lista = new ListaCircularDoble();

        System.out.println("=== E2: Operaciones en Lista Circular Doble ===\n");

        // Inserción al final
        System.out.println("-- Insertar 10 al final --");
        lista.insertarAlFinal(10);
        lista.mostrarAdelante();
        lista.mostrarAtras();

        System.out.println("\n-- Insertar 20 al final --");
        lista.insertarAlFinal(20);
        lista.mostrarAdelante();
        lista.mostrarAtras();

        System.out.println("\n-- Insertar 30 al final --");
        lista.insertarAlFinal(30);
        lista.mostrarAdelante();
        lista.mostrarAtras();

        // Inserción al inicio
        System.out.println("\n-- Insertar 5 al inicio --");
        lista.insertarAlInicio(5);
        lista.mostrarAdelante();
        lista.mostrarAtras();

        System.out.println("\n-- Insertar 1 al inicio --");
        lista.insertarAlInicio(1);
        lista.mostrarAdelante();
        lista.mostrarAtras();

        // Eliminar nodo interior
        System.out.println("\n-- Eliminar nodo interior (valor 10) --");
        lista.eliminar(10);
        lista.mostrarAdelante();
        lista.mostrarAtras();

        // Eliminar cabeza
        System.out.println("\n-- Eliminar cabeza (valor 1) --");
        lista.eliminar(1);
        lista.mostrarAdelante();
        lista.mostrarAtras();

        // Eliminar cola
        System.out.println("\n-- Eliminar cola (valor 30) --");
        lista.eliminar(30);
        lista.mostrarAdelante();
        lista.mostrarAtras();

        System.out.println("\nTamaño final: " + lista.tamanio());
    }
}
