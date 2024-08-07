package exercicioDio;

import java.util.Objects;
import java.util.Scanner;

public class LoopValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        String resposta = "";
        scanner.close();


        // TODO: Verifique se o serviço está na lista de serviços contratados
        for (String assinatura: partes){
            if (assinatura.equals(servico)){
                contratado = true;
                break;
            }
        }

        if (contratado){
            resposta = "Sim";
        }else{
            resposta = "Nao";
        }

        System.out.println(resposta);

    }

}