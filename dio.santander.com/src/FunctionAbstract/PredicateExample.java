package FunctionAbstract;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        //Predicate é usado como argumento de validação, retornando true ou false, podendo ser usado em .filter()

        List<String> linguagens = Arrays.asList("Kotlin", "Java", "JS", "PHP", "GoLang");

        Predicate<String> validacaoMaisDeCincoCaracteres = e -> e.length() > 5;

        linguagens.stream().filter(e -> e.length() < 5).forEach(System.out::println);
//        linguagens.stream().filter(validacaoMaisDeCincoCaracteres).forEach(System.out::println);
//        linguagens.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 5;
//            }
//        }).forEach(System.out::println);
    }
}
