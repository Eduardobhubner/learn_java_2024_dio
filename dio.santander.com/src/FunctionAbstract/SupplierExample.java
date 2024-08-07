package FunctionAbstract;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        // Um Supplier que fornece uma String
        Supplier<String> stringSupplier = () -> "Hello, World!";

        // Usando o Supplier para obter o valor
        String result = stringSupplier.get();
        System.out.println(result);  // Saída: Hello, World!
    }
}
