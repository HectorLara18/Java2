import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa tu calificaicón: ");
        double calificacion = Double.parseDouble(consola.nextLine());

        if(calificacion <= 10 && calificacion > 9) {
            System.out.println("Calificación: A");
        } else if(calificacion <= 9 && calificacion > 8) {
            System.out.println("Calificación: B");
        } else if(calificacion <= 8 && calificacion > 7) {
            System.out.println("Calificación: C");
        } else if(calificacion <= 7 && calificacion > 6) {
            System.out.println("Calificación: D");
        } else if(calificacion <= 6 && calificacion > 0) {
            System.out.println("Calificación: F");
        } else {
            System.out.println("Valor Desconocido");
        }
    }
}
