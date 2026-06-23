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

        Envio envio1 =
                new Envio(
                        "ENV001",
                        "Sucursal Norte",
                        15000,
                        cliente1,
                        producto1);

        envio1.mostrarInformacion();
    }
}