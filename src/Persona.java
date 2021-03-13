public class Persona {
    //Atributos
    private static int id;
    String nombre;
    String apellido;
    String personType;

    //Constructor
    Persona(String nombre, String apellido) {
        id++;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void getName() {
        System.out.println(nombre);
    }


}
