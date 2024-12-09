public class ParImparVerificador {

    public static void verificarParImpar(Integer... numbers) {
        /*
        for (int i = 0; i < numbers.length; i++) {

        }*/

        //Tipo da variavel no singular, variavel, lista
        for(Integer number : numbers) {
            if(number % 2 == 0) {
                System.out.println("O número " + number + " é par!");
            } else {
                System.out.println("O número " + number + " é impar!");
            }
        }
    }
}
