package FunctionAbstract;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {

    public static void main(String[] args) {

        //criação de uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //uso do consumer usando o stream como chamada
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
