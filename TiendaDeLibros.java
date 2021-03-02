import java.util.Scanner;

public class TiendaDeLibros {
    public static void main(String[] args) {
        int id;
        String nombre;
        double price;
        boolean envioGratuito;

        Scanner consola = new Scanner(System.in);

        System.out.println("proporciona el nombre:");
        nombre = consola.nextLine();
        System.out.println("proporciona el iD:");
        id = Integer.parseInt(consola.nextLine());
        System.out.println("proporciona el precio: ");
        price = Double.parseDouble(consola.nextLine());
        System.out.println("proporciona el envio gratuito");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println(
                "id: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Precio: "  + price + "\n" +
                "Envio Gratis: " + envioGratuito
        );

        if(envioGratuito) {
            System.out.println("Su envio sera programado en breve");
        } else {
            System.out.println("Ingrese metodo de pago para envio");
        }
    }
}
