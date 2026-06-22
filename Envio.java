public class Envio {

    //Atributos Privados (encapsulamiento)
    private String idEnvio;
    private String destino;
    private double costoEnvio;

    // Constructor por defecto
    public Envio() {
        this.idEnvio = "SIN_ID";
        this.destino = "SIN_DESTINO";
        this.costoEnvio = 0;
    }
    
    // Constructor parametrizado
    public Envio(String idEnvio, String destino, double costoEnvio) {
        this.idEnvio = idEnvio;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
    }

    //Getters pára idEnvio
    public String getIdEnvio() {
        return idEnvio;
    }

    //Setters para idEnvio
    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    //Getters para destino
    public String getDestino() {
        return destino;
    }

    //Setters para destino
    public void setDestino(String destino) {
        this.destino = destino;
    }

    //Getters para costoEnvio
    public double getCostoEnvio() {
        return costoEnvio;
    }

    //Setters con validacion para costoEnvio
    public void setCostoEnvio(double costoEnvio) {
        if(costoEnvio >= 0) {
            this.costoEnvio = costoEnvio;
        } else {
            System.out.println("Error: El costo del envío no puede ser negativo.");
        }
    }

    // Método para mostrar información del envío
       public void mostrarInformacion() {
        System.out.println("ID Envío: " + idEnvio);
        System.out.println("Destino: " + destino);
        System.out.println("Costo: $" + costoEnvio);
    }
}