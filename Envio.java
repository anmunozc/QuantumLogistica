public class Envio {

    String idEnvio;
    String destino;
    double costoEnvio;

    public Envio(String idEnvio, String destino, double costoEnvio) {
        this.idEnvio = idEnvio;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
    }

    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    } 
    
    public void setCostoEnvio(double costoEnvio) {
        if(costoEnvio >= 0) {
            this.costoEnvio = costoEnvio;
        } else {
            System.out.println("Error: El costo del envío no puede ser negativo.");
        }
    }

       public void mostrarInformacion() {
        System.out.println("ID Envío: " + idEnvio);
        System.out.println("Destino: " + destino);
        System.out.println("Costo: $" + costoEnvio);
    }
}