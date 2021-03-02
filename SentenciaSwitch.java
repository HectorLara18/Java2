import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("¿en que mes estamos?");
        int temporada = Integer.parseInt(consola.nextLine());

        switch (temporada){
            case 1:
                System.out.println("Es Invierno");
                break;
            case 2:
                System.out.println("Sigue Siendo Invierno");
                break;
            case 3:
                System.out.println("Ya es primavera");
                break;
            default:
                System.out.println("No es un numero valido!!");
        }
    }
}
