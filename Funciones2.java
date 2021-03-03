public class Funciones2 {

    public static void holaMundo() {
        System.out.println("Hola mundo");
    }

    public static String nombre(String nombre){
        return nombre;
    }

    public static String consola;

    public static void main(String[] args) {
        String usuario = nombre("Hector Lara");
        System.out.println(usuario);
    }
}
