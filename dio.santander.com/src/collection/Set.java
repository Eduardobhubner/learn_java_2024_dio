package collection;
import java.util.HashSet;

//Set é um objeto da classe java.util, ele pertence a framework collection e teve como objetivo
//ser uma lista SEM ÍNDICE e que NÃO PODE HAVER DUPLICIDADE

public class Set {
    
    public static void main(String[] args) {
        
        //criar o objeto hashset
        HashSet<String> listaSet = new HashSet<>();

        //adicionar elementos dentro da lista 
        listaSet.add("elemento 1");
        listaSet.add("elemento 2"); 
        listaSet.add("elemento 3"); 
        listaSet.add("elemento 1"); 


        //se existe
        if(listaSet.contains("elemento 2"))System.out.println("Elemento contem na lista");

        //percorrer sobre a lista
        for (String titulo : listaSet) {
            System.out.println(titulo);
        }

        //excluir item da lista
        listaSet.remove("elemento 3");

        //verificar o tamanho da lista
        System.out.println("tamanho da lista" + listaSet.size());

    }

}
