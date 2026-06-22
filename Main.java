public class Main {

    public static void main(String[] args) {

        // Constructor por defecto
        Envio envio1 = new Envio();

        // Constructor parametrizado
        Envio envio2 = new Envio("ENV001", "Sucursal Norte", 15000);

        System.out.println("== Envío creado con constructor por defecto ==");
        envio1.mostrarInformacion();

        System.out.println();

        System.out.println("== Envío creado con constructor parametrizado ===");
        envio2.mostrarInformacion();
    }
}