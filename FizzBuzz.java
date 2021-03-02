public class FizzBuzz {
    public static void main(String[] args) {

        for (int contador = 0; contador <= 100; ++ contador) {
            if(contador % 3 == 0 && contador % 5 != 0) {
                System.out.println("Fizz");
            } else if(contador % 5 == 0 && contador % 3 != 0){
                System.out.println("Buzz");
            } else if((contador % 5 == 0) && (contador % 3 == 0)){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(contador);
            }
        }
    }
}
