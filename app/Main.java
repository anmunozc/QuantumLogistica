//declaracion del paquete donde se encuentra la clase Main
package app;
//Importacion Formal de las clases
import modelo.Envio;

public class Main {

    public static void main(String[] args) {

       //Inicializacion de las instancias para el entorno logistico
        Envio envio1 = new Envio();
        Envio envio2 = new Envio("ENV001", "Sucursal Norte", 15000);

        System.out.println("== Envío creado con constructor por defecto ==");
        envio1.mostrarInformacion();

        System.out.println();

        System.out.println("== Envío creado con constructor parametrizado ===");
        envio2.mostrarInformacion();
    }
}