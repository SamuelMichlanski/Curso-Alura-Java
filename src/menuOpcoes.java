import java.util.Scanner;

public class menuOpcoes {
    static void main(){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite 1 para calcular a área do quadrado e 2 para calcular a área do circulo:");
        int opcoes = leitura.nextInt();
        leitura.nextLine();


        if (opcoes==1){

            System.out.println("Digite o lado do quadrado:");
            String quadrado = leitura.nextLine();

            double numeroQuadrado = Double.parseDouble(quadrado.replace(",","."));
            double resultadoQuadrado = numeroQuadrado * numeroQuadrado;
            System.out.printf("Se o lado do quadrado for igual a %s, o resultado é: %.2f.",quadrado, resultadoQuadrado);

        } else if (opcoes==2){
            System.out.println("Digite o raio do circulo:");
            String circulo = leitura.nextLine();

            double numeroCirculo = Double.parseDouble(circulo.replace(",","."));
            double resultadoCirculo = Math.PI * numeroCirculo * numeroCirculo;

            System.out.printf("Se o raio do circulo for %s o resultado é: %.2f.",circulo, resultadoCirculo);


        } else {
            System.out.println("Você escolheu a opção errada e deu erro.");
        }




    }
}
