/**
 * Ejercicio 2 - Implementación de la Lista Enlazada
 * Semana 6: Listas Enlazadas Simples
 *
 * Se demuestra cómo usar una clase administradora (ListaEnlazada)
 * para agregar datos de manera organizada sin manipular los punteros
 * directamente desde el código principal.
 */
public class E2ListaEnlazadaBasica {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   Lista Enlazada Administrada (Automática)");
        System.out.println("==============================================");

        // 1. Creamos el objeto lista
        ListaEnlazada lista = new ListaEnlazada();

        // 2. Insertamos algunos datos al inicio
        System.out.println("Insertando 10, luego 20, luego 30...");
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);

        // 3. Imprimimos el resultado
        System.out.println("\nEstado actual de la lista:");
        lista.imprimirLista();

        // 4. Explicación de por qué el orden es inverso
        System.out.println("\nNota: Como insertamos al inicio, el último");
        System.out.println("dato agregado (30) es ahora la Cabeza.");
    }
}
