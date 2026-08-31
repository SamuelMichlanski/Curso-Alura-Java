import java.util.Scanner;


public class numerosInteiros {
    static void main() {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int number1 = leitura.nextInt();

        System.out.println("Digite outro número inteiro:");
        int number2 = leitura.nextInt();


        if (number1==number2){
            System.out.println("Esses números são iguais!");
        } else if (number1>number2){
            System.out.println("São números diferentes e o primeiro número inteiro digitado é maior que o segundo.");
        } else {
            System.out.println("São números diferentes e o segundo número inteiro digitado é maior que o primeiro.");
        }
    }
}
