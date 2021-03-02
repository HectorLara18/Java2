import java.util.Scanner;

public class Comparativa {
    public static void main(String[] args){
        String cadena = "Hola Mundo";
        String cadena2 = "Hdola Mundo";
        String password = "root";

        Scanner consola = new Scanner(System.in);

        boolean comparar = cadena == cadena2;
        System.out.println("comparar = " + comparar);

        boolean comparar2 = cadena.equals(cadena2);
        System.out.println("comparar2 = " + comparar2);

        System.out.println("Ingresa tu password: ");
        String entrada = consola.nextLine();

        boolean compararPassword = password.equals(entrada);

        if(compararPassword) {
            System.out.println("Bienvenido");
        } else{
            System.out.println("Rejected!!");
        }

    }
    
}
