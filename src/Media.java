import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua nota:");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

        }

        System.out.println("Média das notas é: " + (int)(mediaAvaliacao / 3));

    }
}
