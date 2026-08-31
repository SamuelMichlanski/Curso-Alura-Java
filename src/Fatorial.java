import java.util.Scanner;

public class Fatorial {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial:");
        int numero = leitura.nextInt();
        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de "+ numero +" é: "+fatorial);
    }
}
