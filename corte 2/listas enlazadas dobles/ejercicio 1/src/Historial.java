public class Historial {
  Cambio cabeza; // Primer cambio en la lista
  Cambio cola; // Último cambio en la lista

  public Historial() {
    this.cabeza = null;
    this.cola = null;
  }

  // Método para agregar un cambio al final de la lista
  public void agregarCambio(Cambio cambio) {
    if (cabeza == null) {
      cabeza = cambio;
      cola = cambio;
    } else {
      cola.siguiente = cambio;
      cambio.anterior = cola;
      cola = cambio;
    }
  }

  // Método para deshacer el último cambio
  public Cambio deshacer(Cambio cambioActual) {
    if (cambioActual.anterior == null) {
      System.out.println("No hay cambios para deshacer.");
      return cambioActual; // No se puede deshacer, retornar el mismo cambio      
    }
    return cambioActual.anterior; // Mover el puntero hacia atrás
  }

  // Método para rehacer el siguiente cambio
  public Cambio rehacer(Cambio cambioActual) {
    if (cambioActual.siguiente == null) {
      System.out.println("No hay cambios para rehacer.");
      return cambioActual; // No se puede rehacer, retornar el mismo cambio
    }
    return cambioActual.siguiente; // Mover el puntero hacia adelante
  }

}
