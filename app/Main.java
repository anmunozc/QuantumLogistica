package app;

import modelo.Cliente;
import modelo.Envio;
import modelo.Producto;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 =
                new Cliente("CLI001", "Bilbo Baggins");

        Producto producto1 =
                new Producto("PROD001", "Tabaco Old Toby", 4.5);
      // Error 1: costo negativo
        try {

            Envio envioError =
                    new Envio();

            envioError.setCostoEnvio(-5000);

        } catch (IllegalArgumentException e) {

            System.out.println("ERROR DE ENVÍO:");
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Error 2: producto nulo
        try {

            Envio envio2 =
                    new Envio(
                            "ENV002",
                            "Sucursal Sur",
                            18000,
                            cliente1,
                            null);

            System.out.println(
                    envio2.getProducto().getNombre());

        } catch (NullPointerException e) {

            System.out.println("ERROR DE PRODUCTO:");
            System.out.println(
                    "No existe un producto asociado al envío.");
        }

        System.out.println();

        // Ejecución correcta
        Envio envioCorrecto =
                new Envio(
                        "ENV003",
                        "Sucursal Norte",
                        20000,
                        cliente1,
                        producto1);

        envioCorrecto.mostrarInformacion();
    }
}