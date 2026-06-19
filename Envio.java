public class Envio {

    String idEnvio;
    String destino;
    double costoEnvio;

    public Envio(String idEnvio, String destino, double costoEnvio) {
        this.idEnvio = idEnvio;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
    }

    public void mostrarInformacion() {
        System.out.println("ID Envío: " + idEnvio);
        System.out.println("Destino: " + destino);
        System.out.println("Costo: $" + costoEnvio);
    }
}