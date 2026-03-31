/**
 * Ejemplo 2: Operaciones Básicas en Lista Doble
 * Se muestra cómo insertar al inicio y al final utilizando la clase ListaDoble.
 */
public class E2ListaDobleBasica {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        // 1. Insertar al inicio
        lista.insertarAlInicio(100);
        lista.insertarAlInicio(200);

        // 2. Insertar al final
        lista.insertarAlFinal(300);
        lista.insertarAlFinal(400);

        // 3. Mostrar la lista en ambos sentidos
        System.out.println("Lista después de inserciones:");
        lista.imprimirAdelante(); // Debería ser: 200 <-> 100 <-> 300 <-> 400
        lista.imprimirAtras();    // Debería ser: 400 <-> 300 <-> 100 <-> 200
    }
}
