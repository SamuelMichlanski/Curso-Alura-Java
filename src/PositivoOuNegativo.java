import java.util.Scanner;

public class PositivoOuNegativo {
    static void main() {
        System.out.println("Digite um número para a identificação se é positivo ou negativo");
        Scanner leitura = new Scanner(System.in);

        int numero = leitura.nextInt();


        if (numero==0){
            System.out.println("Esse número não é nagativo nem positivo esse número é 0.");
        } else  if (numero>0){
            System.out.println("Esse número é positivo.");
        } else {
            System.out.println("Esse número é negativo.");
        }

    }
}
