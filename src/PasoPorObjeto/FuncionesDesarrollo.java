package PasoPorObjeto;

public class FuncionesDesarrollo {

    FuncionesDesarrollo() { }

    public static void accesoGeneralGit(Empleado empleado) {
        if(empleado.getDepartamento() == "Desarrollo") {
            System.out.println("Grant Access");
        } else {
            System.out.println("Deny Access");
        }
    }

    public static void AccessLevel(Empleado empleado) {
        switch (empleado.getPuesto()) {
            case "Ingeniero Sr":
                System.out.println("Acceso Total");
                break;
            case "Ingeniero Backend":
                System.out.println("Acceso Backend");
                break;
            case "Ingeniero Frontend":
                System.out.println("Acceso Frontend");
                break;
            case "Ingeniero Jr":
                System.out.println("Acceso Development");
                break;
            default:
                return;
        }
    }
}
