import java.util.Scanner;

public class Leitura {
    static void main(String[] args) {
        Scanner leitura =   new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual é o ano de lançamento ? ");
        int anoDeLançamento = leitura.nextInt();
    }
}