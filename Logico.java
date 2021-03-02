public class Logico {
    public static void main(String[] args) {
        boolean myTrue = true;
        boolean myFalse = false;
        System.out.println(myFalse && myFalse);
        System.out.println(myFalse || myTrue);
        int edad = 11;

        if(myTrue) {
            System.out.println("la bandera es verdadera");
        } else {
            System.out.println("la bandera es falsa ");
        }

        if(edad >= 18){
            System.out.println("es mayor de edad!!");
        } else {
            System.out.println("Eres menor de edad!!");
        }
    }


}
