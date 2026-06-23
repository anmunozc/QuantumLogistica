package modelo;

public class Cliente {

    private String idCliente;
    private String nombre;

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre);
    }
}