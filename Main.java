public class Main {

    public static void main(String[] args) {

        // Creación del objeto
        Envio envio1 = new Envio(
                "ENV001",
                "Sucursal Norte",
                15000);

        // Prueba de validación
        envio1.setCostoEnvio(-5000);

        // Mostrar información del envío
        envio1.mostrarInformacion();
    }
}