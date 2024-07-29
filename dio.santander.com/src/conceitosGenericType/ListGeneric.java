import java.util.ArrayList;
import java.util.List;

public class ListGeneric {

    public static void main(String[] args) {

        List listaComum = new ArrayList();
        listaComum.add("10");
        listaComum.add("XPTO");

        System.out.println(listaComum);

        List<String> listaGenerica = new ArrayList<>();

        listaGenerica.add("XPTO");
        // listaGenerica.add(23); //vai dar erro por n estar dentro do tipo definido

        for (String string : listaGenerica) {
            System.out.println(string);
        }

        //Quando não especifica o tipo, necessário fazer um cast
        for (Object element : listaComum) {
            String aux = (String) element;
            System.out.println(aux);
        }

    }
}
