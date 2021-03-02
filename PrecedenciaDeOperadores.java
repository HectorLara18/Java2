import java.util.Scanner;

public class PrecedenciaDeOperadores {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el valor de x");
        var x = Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa el valor de y");
        var y = Integer.parseInt(consola.nextLine());
        var z = ++x + y--;

        System.out.println(z);
        System.out.println(y);
        System.out.println(x);




    }
}
