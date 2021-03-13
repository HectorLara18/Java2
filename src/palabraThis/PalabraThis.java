package palabraThis;

public class PalabraThis {
    public static void main(String[] args) {

        Persona persona = new Persona("Hector", "Lara");
        System.out.println(persona.nombre);

    }
}

class Persona {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Direccion de objeto: " + this);
        System.out.println("this.nombre = " + this.nombre);
        System.out.println("this.apellido = " + this.apellido);
    }
}


