import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldo = 2500.00;
        boolean continuar = true;

        String menu1 = """
                ***********************
                Dados iniciais do cliente:
                
                Nome: João Pedro Blagitz Ravache
                Tipo conta: Corrente
                """;

        String menu2 = """
                ***********************
                
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        System.out.print(menu1);
        System.out.println("Saldo inicial: R$ " + String.format("%.2f", saldo));

        while(continuar){

            System.out.print(menu2);
            int opcao = sc.nextInt();
            boolean consultaSaldo = (opcao == 1);
            boolean receber = (opcao == 2);
            boolean transferir = (opcao == 3);
            boolean sair = (opcao == 4);

            if(consultaSaldo){

                System.out.println("Saldo total: R$ " + String.format("%.2f", saldo));

            }else if (receber){

                System.out.println("Qual o valor a ser recebido?");
                double valorRecebido = sc.nextDouble();
                if (valorRecebido > 0){
                    saldo += valorRecebido;
                    System.out.println("Saldo atualizado: R$ " + String.format("%.2f", saldo));
                }else{
                    System.out.println("O valor depositado deve ser positivo!");
                }

            }else if (transferir){

                System.out.println("Qual o valor a ser transferido?");
                double valorTransferido = sc.nextDouble();

                if(valorTransferido > 0 && valorTransferido <= saldo){
                    saldo -= valorTransferido;
                    System.out.println();
                    System.out.println("Saldo atualizado: R$ " + String.format("%.2f", saldo));
                }else if (valorTransferido > saldo){
                    System.out.println("O valor transferido não deve exceder saldo da conta!");
                }else{
                    System.out.println("O valor transferido deve ser positivo!");
                }

            }else if (sair){

                System.out.println("Processo finalizado");
                continuar = false;

            }else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        }

        sc.close();
    }
}
