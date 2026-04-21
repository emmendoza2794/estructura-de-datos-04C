public class Estacion {
    String nombre;
    int zona;
    int pasajerosDiarios;
    Estacion siguiente;
    Estacion anterior;

    public Estacion(String nombre, int zona, int pasajerosDiarios) {
        this.nombre = nombre;
        this.zona = zona;
        this.pasajerosDiarios = pasajerosDiarios;
        this.siguiente = null;
        this.anterior = null;
    }
}
