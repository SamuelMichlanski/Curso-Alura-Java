import java.util.Scanner;

public class desafioBanco {
    static void main(String[] args) {

        //Dados
        String nome = "Samuel Michlanski";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;


        System.out.println("*******************\n" );
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo + "\n");
        System.out.println("*******************\n\n");

        //Operações

        System.out.println("Operações" );

        String menu = """
                | Digite sua opção. |\n
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();


            if (opcao == 1) {

                System.out.println("Seu saldo é: " + saldo + "\n");

            } else if (opcao == 2) {

                System.out.println("Informe o valor a receber: " );
                double recebe = leitura.nextDouble();

                // double saldoRecebido = saldo + recebe;
                saldo += recebe;

                System.out.println("Saldo atualizado R$  " + saldo + "\n" );

            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:" );
                double transferencia = leitura.nextDouble();
                if (transferencia <= saldo) {

                    saldo -= transferencia;
                    System.out.println("Saldo atualizado R$ " + saldo + "\n");

                } else{
                    System.out.println("Você não tem saldo o suficiente para essa transferência.\n" );
                }
            } else if (opcao == 4) {

                System.out.println("Saindo..." );

            } else {

                System.out.println("Opção inválida.\n" );
               // System.out.println(menu);
            }
        }
    }
}







 /* if (opcao == 1) {

            System.out.println("Seu saldo é: " + saldo);

        } else if (opcao == 2) {

            System.out.println("Informe o valor a receber: " );
            double recebe = leitura.nextDouble();

            // double saldoRecebido = saldo + recebe;
            saldo += recebe;

            System.out.println("Saldo atualizado R$  " + saldo);

        } else if (opcao == 3) {
            System.out.println("Informe o valor que deseja transferir:" );
            double transferencia = leitura.nextDouble();
            if (transferencia <= saldo) {

                saldo -= transferencia;
                System.out.println("Saldo atualizado R$ " + saldo);

            } else{
                System.out.println("Você não tem saldo o suficiente para essa transferência." );
            }
        } else if (opcao == 4) {

            System.out.println("Saindo..." );

        } else {

            System.out.println("Opção inválida." );

        } */