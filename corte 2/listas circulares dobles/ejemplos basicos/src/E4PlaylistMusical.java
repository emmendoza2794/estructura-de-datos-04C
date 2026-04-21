/**
 * Ejemplo 4: Playlist Musical — Caso de Aplicación Real
 * Una lista circular doble de canciones permite navegar hacia adelante
 * y hacia atrás de forma natural, igual que un reproductor de música real.
 */

class Cancion {
    String titulo;
    String artista;
    int duracion; // segundos
    Cancion siguiente;
    Cancion anterior;

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }
}

class Playlist {
    Cancion cabeza;
    Cancion cola;
    Cancion actual; // La canción que suena ahora

    public void agregar(String titulo, String artista, int duracion) {
        Cancion nueva = new Cancion(titulo, artista, duracion);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
            actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void siguiente() {
        actual = actual.siguiente;
    }

    public void anterior() {
        // O(1) gracias al puntero anterior — en una lista simple sería O(n)
        actual = actual.anterior;
    }

    public void mostrarActual() {
        System.out.println("  ▶  " + actual.titulo + " — " + actual.artista
                + "  (" + actual.duracion / 60 + ":" + String.format("%02d", actual.duracion % 60) + ")");
    }
}

public class E4PlaylistMusical {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.agregar("Bohemian Rhapsody", "Queen", 354);
        playlist.agregar("Hotel California", "Eagles", 391);
        playlist.agregar("Stairway to Heaven", "Led Zeppelin", 482);
        playlist.agregar("Comfortably Numb", "Pink Floyd", 382);
        playlist.agregar("Smells Like Teen Spirit", "Nirvana", 301);

        System.out.println("=== E4: Playlist Musical — Lista Circular Doble ===\n");
        System.out.println("Playlist cargada con 5 canciones.");
        System.out.println("Reproducción iniciando desde el principio:\n");

        playlist.mostrarActual();

        System.out.println("\n-- Avanzar dos canciones --");
        playlist.siguiente();
        playlist.mostrarActual();
        playlist.siguiente();
        playlist.mostrarActual();

        System.out.println("\n-- Retroceder una canción (O(1) con puntero anterior) --");
        playlist.anterior();
        playlist.mostrarActual();

        System.out.println("\n-- Avanzar hasta el final de la lista y dar la vuelta --");
        playlist.siguiente();
        playlist.mostrarActual();
        playlist.siguiente();
        playlist.mostrarActual();
        playlist.siguiente();
        playlist.mostrarActual(); // Da la vuelta: regresa a la primera

        System.out.println("\n-- Retroceder desde la primera: llegamos a la última --");
        playlist.anterior();
        playlist.mostrarActual(); // La lista es circular: el anterior de la primera es la última

        System.out.println("\nLa playlist nunca termina — es circular en ambas direcciones.");
    }
}
