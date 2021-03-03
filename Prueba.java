import Empleado.Person;

public class Prueba {
    public static void main(String[] args) {
        Person empleado1 = new Person("Hector", "Lara");
        System.out.println("El Nombre del usuario es: " + empleado1.obtenerNombre());
        empleado1.desplegarInformacion();
    }
}
