package FunctionAbstract;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {


    public static void main(String[] args) {

    List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);

    //Function<Integer, Integer> dobro = numero -> numero * 2;

    List<Integer> numeroDobrado = listaNumeros.stream()
            .map( n -> n * 2)
            //.map(dobro)
            .toList();

    numeroDobrado.forEach(System.out::println);

    }


}
