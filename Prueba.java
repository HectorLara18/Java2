import Empleado.Person;

public class Prueba {
    public static void main(String[] args) {
        Person empleado1 = new Person("Hector", "Lara");
        System.out.println("El Nombre del usuario es: " + empleado1.obtenerNombre());
        empleado1.desplegarInformacion();
        System.out.println(empleado1.id);

        Person empleado2 = new Person("Raul", "Lara");
        empleado2.desplegarInformacion();
        System.out.println(empleado2.id);
    }
}
