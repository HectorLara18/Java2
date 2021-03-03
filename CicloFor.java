import java.lang.reflect.Array;

public class CicloFor {
    public static void main(String[] args) {
        int x;
        String[] frutas = {"manzana", "platano"};
        for(x = 0; x < 10; x++){
            System.out.println("x = " + x);
        }

        for (String fruta : frutas) {
            System.out.println("Mis frutas son = " + fruta);
            if (fruta == "manzana") {
                System.out.println("Debes de comprar de las verdes");
            }
        }

        for (String f: frutas) {
            System.out.println("imprimo: " + f);
        }
    }
}
