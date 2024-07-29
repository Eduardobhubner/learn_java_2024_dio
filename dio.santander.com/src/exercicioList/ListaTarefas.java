package exercicioList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    List<String> descricaoTarefa = new ArrayList<>();

    public void adicionarTarefa(String descricao) {

        descricaoTarefa.add(descricao);

    }

    public void removerTarefa(String descricao) {

        if (descricaoTarefa.contains(descricao)) {
            descricaoTarefa.remove(descricao);
        } else {
            System.out.println("Descrição não contem na lista");
        }
    }

    public void obterNumeroTotalTarefas() {
        System.out.println(descricaoTarefa.size());
    }

    public void obterDescricoesTarefas() {
        System.out.println(descricaoTarefa);
    }

}
