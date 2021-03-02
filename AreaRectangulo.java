import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        int alto;
        int ancho;
        int area;
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el alto: ");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());
        area = alto * ancho;
        System.out.println("el area es: " + area);

    }
}
