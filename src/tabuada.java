import java.util.Scanner;

public class tabuada {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber a tabuada:");
        int numeroTabuada = leitura.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + numeroTabuada * i);
        }

    }
}
