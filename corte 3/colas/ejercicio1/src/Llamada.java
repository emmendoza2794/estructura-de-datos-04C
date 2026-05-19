public class Llamada {

  int idLlamada;
  String nombreCliente;
  String motivoConsulta;
  int duracionEstimadaMinutos;

  Llamada siguiente;

  public Llamada(int idLlamada, String nombreCliente, String motivoConsulta, int duracionEstimadaMinutos) {
    this.idLlamada = idLlamada;
    this.nombreCliente = nombreCliente;
    this.motivoConsulta = motivoConsulta;
    this.duracionEstimadaMinutos = duracionEstimadaMinutos;
    this.siguiente = null;
  }
}
