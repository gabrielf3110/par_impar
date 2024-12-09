import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int x1 = sc.nextInt();

        System.out.println("Digite o primeiro numero: ");
        int x2 = sc.nextInt();

        System.out.println("Digite o primeiro numero: ");
        int x3 = sc.nextInt();

        ParImparVerificador.verificarParImpar(x1, x2, x3);
    }
}
