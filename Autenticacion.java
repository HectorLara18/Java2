import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        String pass = "hlara";

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa tu password: ");
        String password = consola.nextLine();

        if(pass.equals(password)) {
            System.out.println("Password Correcto!!");
        } else {
            do {
                System.out.println("Wrong!!, Enter your password again");
                password = consola.nextLine();
            }while (!pass.equals(password));
        }
    }
}
