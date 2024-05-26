package conceitosFundamentais;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean status = true;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (status) {

            System.out.println("Ecolher alguma opção bancária:");
            System.out.println("1 - Valor a ser depositado");
            System.out.println("2 - Valor a ser sacado");
            System.out.println("3 - Visualizar saldo atual da conta");
            System.out.println("0 - Encerrar programa");

            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.
            // Se o usuário escolher:
            // 1: O programa solicitará o valor a ser depositado e atualizará o saldo.
            // 2: O programa solicitará o valor a ser sacado e verificará se há saldo
            // suficiente.
            // 3: O programa exibirá o saldo atual da conta.
            // 0: O programa encerrará.

            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor a ser depositado?");
                    double saldoDepositado = scanner.nextDouble();
                    saldo += saldoDepositado;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor a ser sacado?");
                    double valorSacado = scanner.nextDouble();
                    if (valorSacado > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    status = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:

        }

        scanner.close();
    }
}
