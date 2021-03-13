package PasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Hector", "Lara");
        persona1.printName();
        persona1.setName("Humberto");
        persona1.printName();
        persona1 = cambiarValor(persona1);
        System.out.println("persona1 = " + persona1);
    }
    
    public static Persona cambiarValor(Persona persona) {
        persona.setName("Hector");
        return persona;
    }
}
