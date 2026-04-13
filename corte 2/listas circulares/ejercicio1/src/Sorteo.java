public class Sorteo {
  Participante cabeza;
  Participante cola;

  public Sorteo() {
    this.cabeza = null;
    this.cola = null;
  }

  public void agregarParticipante(Participante participante) {
    
    if (cabeza == null) {
      cabeza = participante;
      cola = participante;
      participante.siguiente = cabeza; // Apunta a sí mismo para formar el ciclo
    } else {
      cola.siguiente = participante; // El último apunta al nuevo
      participante.siguiente = cabeza; // El nuevo apunta al primero
      cola = participante; // Actualiza la cola
    }
  }

  public void mostrarParticipantes() {
    if (cabeza == null) {
      System.out.println("No hay participantes registrados.");
      return;
    }

    Participante actual = cabeza;
    do {
      System.out.println("Nombre: " + actual.nombre + ", Número de Boleta: " + actual.numeroBoleta + ", Ciudad: " + actual.ciudad);
      actual = actual.siguiente;
    } while (actual != cabeza);
  }

  public void realizarSorteo(int pasos) {
    if (cabeza == null) {
      System.out.println("No hay participantes para realizar el sorteo.");
      return;
    }

    Participante actual = cabeza;
    for (int i = 0; i < pasos; i++) {
      actual = actual.siguiente;
    }

    System.out.println("Ganador: " + actual.nombre + ", Número de Boleta: " + actual.numeroBoleta);

    eliminarParticipante(actual);
  }

  private void eliminarParticipante(Participante participante) {
    if (cabeza == null || participante == null) {
      return;
    }

    if (cabeza == participante && cabeza == cola) {
      cabeza = null;
      cola = null;
    } else if (cabeza == participante) {
      cabeza = cabeza.siguiente;
      cola.siguiente = cabeza;
    } else {
      Participante actual = cabeza;
      while (actual.siguiente != participante) {
        actual = actual.siguiente;
      }
      actual.siguiente = participante.siguiente;
      if (cola == participante) {
        cola = actual;
      }
    }
  }
}
