public class Metro {
    Estacion cabeza;
    Estacion cola;

    public Metro() {
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarEstacion(String nombre, int zona, int pasajerosDiarios) {
        Estacion nueva = new Estacion(nombre, zona, pasajerosDiarios);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void mostrarLinea() {
        if (estaVacia()) {
            System.out.println("No hay estaciones en la línea.");
            return;
        }
        System.out.println("=== Línea de Metro (sentido horario) ===");
        Estacion actual = cabeza;
        int numero = 1;
        do {
            System.out.println("  " + numero + ". " + actual.nombre
                    + "  [Zona " + actual.zona + "]"
                    + "  (" + actual.pasajerosDiarios + " pasajeros/día)");
            actual = actual.siguiente;
            numero++;
        } while (actual != cabeza);
        System.out.println("  (regresa a " + cabeza.nombre + ")");
    }

    private Estacion buscarEstacion(String nombre) {
        if (estaVacia()) return null;
        Estacion actual = cabeza;
        do {
            if (actual.nombre.equalsIgnoreCase(nombre)) return actual;
            actual = actual.siguiente;
        } while (actual != cabeza);
        return null;
    }

    public void rutaMasCorta(String nombreOrigen, String nombreDestino) {
        Estacion origen = buscarEstacion(nombreOrigen);
        Estacion destino = buscarEstacion(nombreDestino);

        if (origen == null) {
            System.out.println("Estación '" + nombreOrigen + "' no encontrada.");
            return;
        }
        if (destino == null) {
            System.out.println("Estación '" + nombreDestino + "' no encontrada.");
            return;
        }
        if (origen == destino) {
            System.out.println("Ya estás en la estación " + origen.nombre + ".");
            return;
        }

        System.out.println("\nOrigen: " + origen.nombre + "  >>  Destino: " + destino.nombre);

        // Ruta hacia adelante
        StringBuilder rutaAdelante = new StringBuilder(origen.nombre);
        Estacion actual = origen.siguiente;
        int paradasAdelante = 0;
        while (actual != destino) {
            rutaAdelante.append(" > ").append(actual.nombre);
            actual = actual.siguiente;
            paradasAdelante++;
        }
        rutaAdelante.append(" > ").append(destino.nombre);
        paradasAdelante++;

        // Ruta hacia atrás
        StringBuilder rutaAtras = new StringBuilder(origen.nombre);
        actual = origen.anterior;
        int paradasAtras = 0;
        while (actual != destino) {
            rutaAtras.append(" < ").append(actual.nombre);
            actual = actual.anterior;
            paradasAtras++;
        }
        rutaAtras.append(" < ").append(destino.nombre);
        paradasAtras++;

        System.out.println("\n  Ruta hacia adelante (" + paradasAdelante + " paradas):");
        System.out.println("    " + rutaAdelante);
        System.out.println("\n  Ruta hacia atrás   (" + paradasAtras + " paradas):");
        System.out.println("    " + rutaAtras);

        System.out.println();
        if (paradasAdelante < paradasAtras) {
            System.out.println("  Toma la ruta hacia ADELANTE - es " + (paradasAtras - paradasAdelante) + " parada(s) más corta.");
        } else if (paradasAtras < paradasAdelante) {
            System.out.println("  Toma la ruta hacia ATRÁS - es " + (paradasAdelante - paradasAtras) + " parada(s) más corta.");
        } else {
            System.out.println("  Ambas rutas tienen " + paradasAdelante + " paradas - son equivalentes.");
        }
    }
}
