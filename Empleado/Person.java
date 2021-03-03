package Empleado;

public class Person {
    //Atributos de la clase
    protected String nombre;
    protected String apellido;

    public Person(String Nombre, String Apellido){
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
