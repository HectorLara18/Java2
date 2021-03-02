import java.util.Scanner;

public class OperadorRelacional {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Escoge A: ");
        int a = Integer.parseInt(consola.nextLine());
        System.out.println("Escogue B: ");
        int b = Integer.parseInt(consola.nextLine());
        boolean c = a > b;

        System.out.println(c);
        if(c){
            System.out.println("A es mayor que B ");
        } else {
            System.out.println("B es mayor que A");
        }


    }
}
