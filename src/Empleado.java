public class Empleado extends Persona {
    //Atributos
    String departamento;
    String puesto;
    String salario;


    //constructor

    Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public String empleadoConNombreYPuesto() {
        return super.nombre + " " + super.apellido + " " + puesto;
    }

}
