package modelo;

public class Envio {

    // Atributos privados (encapsulamiento)
    private String idEnvio;
    private String destino;
    private double costoEnvio;

    // Relaciones entre clases
    private Cliente cliente;
    private Producto producto;

    // Constructor por defecto
    public Envio() {
        this.idEnvio = "SIN_ID";
        this.destino = "SIN_DESTINO";
        this.costoEnvio = 0;
        this.cliente = null;
        this.producto = null;
    }

    // Constructor parametrizado
    public Envio(String idEnvio,
                 String destino,
                 double costoEnvio,
                 Cliente cliente,
                 Producto producto) {

        this.idEnvio = idEnvio;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
        this.cliente = cliente;
        this.producto = producto;
    }

    // Getters y setters para idEnvio
    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    // Getters y setters para destino
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    // Getters y setters para costoEnvio
    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {

        if (costoEnvio >= 0) {
            this.costoEnvio = costoEnvio;
        } else {
            System.out.println("Error: El costo del envío no puede ser negativo.");
        }
    }

    // Getter y setter para cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Getter y setter para producto
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    // Método para mostrar información del envío
    public void mostrarInformacion() {

        System.out.println("ID Envío: " + idEnvio);
        System.out.println("Destino: " + destino);
        System.out.println("Costo: $" + costoEnvio);

        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre());
        }

        if (producto != null) {
            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Peso: " + producto.getPeso() + " kg");
        }
    }
}