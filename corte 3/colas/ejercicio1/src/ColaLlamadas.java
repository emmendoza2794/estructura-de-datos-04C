public class ColaLlamadas {

  private Llamada salida;   // extremo de salida
  private Llamada entrada;    // extremo de entrada
  private int tamanio;

  public ColaLlamadas() {
    salida   = null;
    entrada = null;
    tamanio = 0;
  }

      // Verifica si la cola está vacía
    public boolean isEmpty() {
        return salida == null;
    }

    // Retorna el número de elementos
    public int size() {
        return tamanio;
    }

    // Consulta la salida sin extraerlo
    public Llamada peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía — no hay elemento en salida");
            return null;
        }
        return salida;
    }

     // Inserta un elemento por la entrada: O(1)
    public void enqueue(Llamada llamada) {
      Llamada nuevo = llamada;
      if (isEmpty()) {
          salida = nuevo;   // primer elemento: salida y entrada apuntan al mismo nodo
          entrada = nuevo;
      } else {
          entrada.siguiente = nuevo;  // el antiguo entrada enlaza al nuevo
          entrada = nuevo;            // entrada avanza al nuevo nodo
      }
      tamanio++;
    }

        // Extrae y retorna el elemento de la salida: O(1)
    public Llamada dequeue() {
      if (isEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Llamada dato = salida;          // dato a retornar
      salida = salida.siguiente;   // salida avanza al siguiente nodo
      if (salida == null) {
          entrada = null;           // la cola quedó vacía: también limpiar entrada
      }
      tamanio--;
      return dato;
    }

    public void imprimir() {
      if (isEmpty()) {
          System.out.println("[ Cola vacía ]");
          return;
      }
      System.out.print("Salida > ");
      Llamada actual = salida;
      while (actual != null) {
          System.out.print("ID:" + actual.idLlamada + " Cliente:" + actual.nombreCliente + " (" + actual.motivoConsulta + ")" + " [" + actual.duracionEstimadaMinutos + " min]");
          if (actual.siguiente != null) 
            System.out.println(" > ");
          actual = actual.siguiente;
      }
      System.out.println(" < Entrada");
    }

    public int contarPorMotivo(String motivo) {
      int contador = 0;
      Llamada actual = salida;
      while (actual != null) {
          if (actual.motivoConsulta.equalsIgnoreCase(motivo)) {
              contador++;
          }
          actual = actual.siguiente;
      }
      return contador;
    }
}
