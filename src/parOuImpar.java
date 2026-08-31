import java.util.Scanner;

public class parOuImpar {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para identificar se é par ou ímpar:");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }
    }
}
