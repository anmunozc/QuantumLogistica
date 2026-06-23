package modelo;

public class Producto {

    private String idProducto;
    private String nombre;
    private double peso;

    public Producto(String idProducto, String nombre, double peso) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Peso: " + peso + " kg");
    }
}