
// La Clase Cambio (Nodo): Debe contener texto (String) y tipoOperacion (String - ej: "Escribir", "Borrar")
public class Cambio {
    String texto;
    String tipoOperacion;

    Cambio siguiente; // Referencia al siguiente cambio en la lista
    Cambio anterior; // Referencia al cambio anterior en la lista

    public Cambio(String texto, String tipoOperacion) {
        this.texto = texto;
        this.tipoOperacion = tipoOperacion;
        this.siguiente = null;
        this.anterior = null;
    }
}
