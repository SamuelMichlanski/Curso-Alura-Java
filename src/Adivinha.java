import java.util.Scanner;
import java.util.Random;

public class Adivinha {
    static void main() {

        int numberRandom = new Random().nextInt(101);

        //System.out.println(numberRandom);
        //Sout acima serve apenas para se quiser testar o código de adivinhação e não ter que ficar jogando até realmente acertar. Tirando o comentário ele vai apenas mostrar o número que é acima.

        System.out.println("Tente adivinhar o número de 0 a 100");
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < 5) {
            tentativas++;

            if (tentativas==5){
                System.out.println("Você está na última tentativa!");
            } else{
                System.out.println("Tentativa: " + tentativas + "/5");
            }

            int palpite = leitura.nextInt();

            if (palpite == numberRandom) {
                System.out.println("Acertou!");
                acertou = true;
                break;
            } else if (palpite > numberRandom) {
                System.out.println("O número secreto é menor.");
            } else if (palpite < numberRandom) {
                System.out.println("O número secreto é maior.");
            }
        }
        leitura.close();

        if (acertou == false) {
            System.out.println("Você excedeu o limite de tentativas");
        }
    }}