import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese numero 2:");
        int numero2 = Integer.parseInt(consola.nextLine());
        if(numero1 > numero2){
            System.out.println("El numero mayor es: " + numero1);
        } else {
            System.out.println("El numero mayor es: " + numero2);
        }

        System.out.println("El numero mayor es: ");
        System.out.println(numero1 > numero2 ? numero1:numero2);

    }
}
