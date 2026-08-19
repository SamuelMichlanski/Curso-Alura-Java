    public class Main{
        public static void main(String[] args) {
            System.out.println("Esse e o Screen Match");
            System.out.println("Filme: Homem Aranha: Um novo dia");

            int anoDeLancamento = 2026;
            System.out.println("Ano de lancamento: " + anoDeLancamento);
            boolean incluidoNoPlano = true;
            double notaDoFilme = 8.1;

            double media= (9.8 + 6.3 + 8.0) /3;
            System.out.println(media);
            String sinopse;
            sinopse = """
                    Filme Homem Aranha
                    Filme de ficcao cientiefica
                    Muito bom!
                    Ano de lancamento: """ + anoDeLancamento;
            System.out.println(sinopse);

            int classificacao = (int) (media /2);
            System.out.println(classificacao);



        }
    }

