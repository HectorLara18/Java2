package Clases;

public class Persona {
    //Atributos
    protected String name;
    String apellido;
    String email;
    String telefono;

    //Constructor

    public Persona(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    //Metodos


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void printName() {
        System.out.println("El Nombre es: " + name + " " + apellido);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
