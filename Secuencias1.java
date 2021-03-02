import java.util.Scanner;

public class Secuencias1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean condición = Boolean.parseBoolean(entrada.nextLine());

        if(condición) {
            System.out.println("se ejecuta este codigo");
        } else {
            System.out.println("se ejecuta este otro codigo");
        }
    }

}
