import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        /**
         * El operador ternario evalua una condición: (CONDICIÓN) ? [SI ES VERDADERO SE EJECUTA ESTO] : [SI ES FALSO SE EJECTUA ESTO]
         */

        var resultado = (3 > 2) ? "Verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        Scanner consola = new Scanner(System.in);
        int entrada = Integer.parseInt(consola.nextLine());
        var esParOImpar = entrada % 2 == 0;
        System.out.println("esParOImpar = " + esParOImpar);

    }

}
