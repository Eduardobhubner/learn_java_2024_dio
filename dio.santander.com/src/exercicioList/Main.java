package exercicioList;

public class Main{
    
    public static void main(String[] args) {
        
    ListaTarefas lista = new ListaTarefas();

    lista.adicionarTarefa("Python");
    lista.adicionarTarefa("Java");
    lista.adicionarTarefa("PHP");

    lista.obterNumeroTotalTarefas();
    lista.obterDescricoesTarefas();

    lista.removerTarefa("Python");
    lista.removerTarefa("JavaScript");

    lista.obterNumeroTotalTarefas();
    lista.obterDescricoesTarefas();

    }
}
