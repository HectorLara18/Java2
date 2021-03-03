package Empleado;

public class Person {
    //Atributos de la clase
    public static int id = 0; //Este metodo tiene la palabra public porque el nivel de acceso es publico y static porque es una variable que puede ser editada por todas las clases
    protected String nombre;
    protected String apellido;

    public Person(String Nombre, String Apellido){
        int userID = id++;
        this.nombre = Nombre;
        this.apellido = Apellido;
    }

    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre + " " + " Apellido " + apellido);
    }

    public void agregarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

}
