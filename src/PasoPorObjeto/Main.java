package PasoPorObjeto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        String name = "Hector";
        String tipoDePersona = "empleado";
        System.out.println("Todo Ok");
        Persona empleado1 = new Persona("Humberto", "Lara");
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        SimpleDateFormat asdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = asdf.format(fechaActual);
        System.out.println(fechaFormateada);

        Empleado empleado2 = new Empleado("Hector", "Lara");
        empleado2.setEstadoDeEmpleado(true);

        if(empleado2.getEstadoDeEmpleado()) {
            empleado2.accesoALosSistemas();
        } else {
            empleado2.quitarAccesoASistemas();
        }

        empleado2.setCampoObligatorio("hectorlaras.18@gmail.com");
        empleado2.setDepartamento("Desarrollo");
        empleado2.setPuesto("Ingeniero Sr");
        accesoRepositorio(empleado2);
        FuncionesDesarrollo.accesoGeneralGit(empleado2);
        FuncionesDesarrollo.AccessLevel(empleado2);
    }

    private static void accesoRepositorio(Empleado empleado) {
        if(empleado.getCampoObligatorio() != null) {
            System.out.println("Acceso a repositorio de Git");
        } else {
            System.out.println("Se necesita cuenta de Git en el sistema para dar acceso a repositorio");
        }
    }

}
