package PasoPorObjeto;

public class Clientes  extends Persona{
    //Atributos

    private static int id;

    Clientes(String name, String apellido) {
        super(name, apellido);
        id++;
    }



}
