public class Desafio {
    public static void main(String[] args) {

        double nota1 = 8.5;
        int nota2 = 4;
        int media = (int) (nota1 + nota2) /2;
        System.out.println("O resultado dessa media e: "+ media);

        String nome = "maria";
        char idade = '8';
        System.out.println(String.format("My name is %s, and i have %c years.", nome,idade));

        String nescau = "Nescau";
        double precoProduto = 21.45;
        int quantidade = 5;
        double resultado = precoProduto * quantidade;
        System.out.println(String.format("O preco do %s e R$ %.2f e se comprar %d unidades da %.2f",nescau, precoProduto, quantidade, resultado));
    }
}
