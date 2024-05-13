import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();

        for (; limiteDiario > 0;) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                limiteDiario = 0;
            } else if (limiteDiario >= valorSaque) {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                limiteDiario = 0;
            }

            scanner.close();

        }

    }

}
