import java.util.Scanner;

public class Libro {
    public static void main(String[] args) {
        Scanner salida = new Scanner(System.in);
        String titulo;
        String autor;
        System.out.println("Proporciona el titulo: \n");
        titulo = salida.nextLine();
        System.out.println("Proporciona el autor: \n");
        autor = salida.nextLine();
        System.out.println(titulo + " Fue escrito por " + autor);
    }
}
