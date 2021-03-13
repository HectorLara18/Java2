package PasoPorObjeto;

public class Empleado extends Persona {

    //Atributos
    private static int id;
    private static boolean estadoDeEmpleado;
    private String campoObligatorio;
    private String departamento;
    private String puesto;

    public Empleado(String name, String apellido) {
        super(name, apellido);
        id++;
    }

    public boolean getEstadoDeEmpleado() {
        return estadoDeEmpleado;
    }

    public void setEstadoDeEmpleado(boolean estadoDeEmpleado) {
        Empleado.estadoDeEmpleado = estadoDeEmpleado;
    }

    public void accesoALosSistemas() {
        System.out.println("Acceso a las herramientas de empleados");
    }

    public void quitarAccesoASistemas() {
        System.out.println("Dado de baja de todos los sistemas");
    }

    public void setCampoObligatorio(String cuentaGit) {
        this.campoObligatorio = cuentaGit;
    }

    public String getCampoObligatorio(){
        return campoObligatorio;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String args) {
        this.departamento = args;
    }

    protected void setPuesto(String args) {
        this.puesto = args;
    }

    protected String getPuesto() {
        return this.puesto;
    }
}
