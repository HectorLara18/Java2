import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre: ");
        Scanner consola = new Scanner(System.in);
        String usuario = consola.nextLine();
        System.out.println("Cual es tu titulo?");
        String titulo = consola.nextLine();
        System.out.println("Bienvenido " + titulo + " " + usuario);
    }
}
