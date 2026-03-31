/**
 * Ejercicio 3 - Ejemplo de la Vida Real: Historial de Navegador
 * Semana 6: Listas Enlazadas Simples
 *
 * Se simula el historial de navegación de un navegador web, donde las
 * páginas más recientes se agregan al inicio (como la Cabeza de la lista).
 */

// Clase Nodo especializada para guardar URLs (Strings)
class NodoPagina {
    String url;
    NodoPagina siguiente;

    public NodoPagina(String url) {
        this.url = url;
        this.siguiente = null;
    }
}

// Clase que administra el historial usando una lista enlazada simple
class HistorialNavegador {
    NodoPagina paginaActual; // Funciona como nuestra "Cabeza"

    public HistorialNavegador() {
        this.paginaActual = null;
    }

    // Al visitar una página, la ponemos al inicio de la lista
    public void visitarPagina(String url) {
        NodoPagina nuevaPagina = new NodoPagina(url);
        nuevaPagina.siguiente = paginaActual;
        paginaActual = nuevaPagina;
        System.out.println("  🌐 Visitando: " + url);
    }

    // Ir atrás es simplemente saltar al siguiente nodo de la lista
    public void irAtras() {
        if (paginaActual != null && paginaActual.siguiente != null) {
            System.out.println("  🔙 Regresando de " + paginaActual.url + " a " + paginaActual.siguiente.url);
            paginaActual = paginaActual.siguiente; // Movemos el puntero al anterior
        } else {
            System.out.println("  ❌ No hay más páginas en el historial.");
        }
    }

    public void mostrarEstado() {
        if (paginaActual == null) {
            System.out.println("El historial está vacío.");
            return;
        }
        System.out.println("  📍 Estás en: " + paginaActual.url);
        
        System.out.print("  Historial: ");
        NodoPagina temp = paginaActual;
        while (temp != null) {
            System.out.print(temp.url + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}

public class E3HistorialNavegador {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   Simulación: Historial de Navegador Web");
        System.out.println("==============================================");

        HistorialNavegador navegador = new HistorialNavegador();

        // 1. Navegamos por algunas páginas
        navegador.visitarPagina("google.com");
        navegador.visitarPagina("youtube.com");
        navegador.visitarPagina("github.com");
        navegador.visitarPagina("stackoverflow.com");

        // 2. Mostramos el estado actual
        System.out.println("\nEstado del Navegador:");
        navegador.mostrarEstado();

        // 3. Simulamos presionar el botón "Atrás"
        System.out.println("\nPresionando botón 'Atrás'...");
        navegador.irAtras();
        navegador.mostrarEstado();

        System.out.println("\nPresionando botón 'Atrás'...");
        navegador.irAtras();
        navegador.mostrarEstado();
    }
}
