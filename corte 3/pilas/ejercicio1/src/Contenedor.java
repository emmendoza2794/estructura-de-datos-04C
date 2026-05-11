public class Contenedor {
    String idCodigo;
    String empresa;
    double peso;
    String tipoCarga;
    Contenedor siguiente;

    public Contenedor(String idCodigo, String empresa, double peso, String tipoCarga) {
        this.idCodigo = idCodigo;
        this.empresa = empresa;
        this.peso = peso;
        this.tipoCarga = tipoCarga;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "[" + idCodigo + " | " + empresa + " | " + peso + "t | " + tipoCarga + "]";
    }
}
