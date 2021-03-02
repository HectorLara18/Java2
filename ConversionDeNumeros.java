import java.util.Scanner;

public class ConversionDeNumeros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String edad = "29";
        int edadInt = Integer.parseInt(edad);
        System.out.println(edadInt++);
        System.out.println(edadInt);

        var valorPi = Double.parseDouble("3.1416");
        System.out.println(valorPi);
        System.out.println(valorPi*4);

        /**

        System.out.println("Valor de Entrada 1: \n");
        String entrada1 = consola.nextLine();
        int entrada1Int = Integer.parseInt(entrada1);
        System.out.println("Valor de Entrada 2: \n");
        String entrada2 = consola.nextLine();
        int entrada2Int = Integer.parseInt(entrada2);
        System.out.println("la suma es: " + (entrada1Int + entrada2Int));
        */

        String  valorDeEntrada= "Hola Gente";
        char character = valorDeEntrada.charAt(0);
        System.out.println(character);


    }

}
