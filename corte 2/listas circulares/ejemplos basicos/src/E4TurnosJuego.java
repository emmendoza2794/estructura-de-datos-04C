/**
 * Ejemplo 4: Caso de Aplicación Real — Turnos en un Juego de Mesa
 *
 * En un juego como el Parqués o el UNO, los jugadores se turnan en ciclo:
 * después del último jugador, el turno vuelve al primero.
 * La lista circular representa esto de forma natural.
 *
 * Este ejemplo no usa la clase genérica ListaCircular para que el
 * estudiante vea cómo adaptar la estructura a un tipo de dato propio.
 */
class Jugador {
    String nombre;
    Jugador siguiente;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}

class RondaJuego {
    Jugador cabeza;
    Jugador cola;
    int totalJugadores;

    public RondaJuego() {
        this.cabeza = null;
        this.cola = null;
        this.totalJugadores = 0;
    }

    /** Agrega un jugador al final del ciclo. */
    public void agregarJugador(String nombre) {
        Jugador nuevo = new Jugador(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
        totalJugadores++;
    }

    /**
     * Simula 'rondas' turnos completos del juego,
     * mostrando de quién es el turno en cada paso.
     */
    public void simularPartida(int rondas) {
        if (cabeza == null) {
            System.out.println("No hay jugadores en la partida.");
            return;
        }

        System.out.println("Jugadores: " + totalJugadores + " | Rondas: " + rondas + "\n");

        Jugador actual = cabeza;
        int turnosTotales = rondas * totalJugadores;

        for (int turno = 1; turno <= turnosTotales; turno++) {
            int rondaActual = ((turno - 1) / totalJugadores) + 1;
            System.out.println("  Ronda " + rondaActual
                    + " | Turno " + turno
                    + " -> " + actual.nombre);
            actual = actual.siguiente;

            // Separador visual entre rondas
            if (turno % totalJugadores == 0 && turno < turnosTotales) {
                System.out.println("  --- fin de ronda " + rondaActual + " ---");
            }
        }
    }
}

public class E4TurnosJuego {
    public static void main(String[] args) {
        RondaJuego partida = new RondaJuego();

        // Registrar jugadores
        partida.agregarJugador("Ana");
        partida.agregarJugador("Bruno");
        partida.agregarJugador("Carlos");
        partida.agregarJugador("Diana");

        System.out.println("=== SIMULADOR DE TURNOS — JUEGO DE MESA ===\n");
        partida.simularPartida(3); // 3 rondas completas

        System.out.println("\nEl turno volvió a Ana automáticamente gracias a la lista circular.");
    }
}
