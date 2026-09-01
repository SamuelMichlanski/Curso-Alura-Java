public class condicional {
    public static void main(String[] args) {


        int anoDeLancamento = 2026;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filem antigo que vale a pena assistir");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");

        // || = ou. E && igual á "e" ou "também"

        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
