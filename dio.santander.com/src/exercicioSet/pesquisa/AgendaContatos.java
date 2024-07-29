package exercicioSet.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    public AgendaContatos() {
        this.listaContato = new HashSet<>();
    }
    Set<Contato> listaContato;

    public void adicionarContato(String nome, int numero){
        listaContato.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(listaContato);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPeloNome = new HashSet<>();
        for (Contato c : listaContato){
            if (c.getNome().startsWith(nome)){
                contatoPeloNome.add(c);
            }
        }
        return contatoPeloNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){

        for(Contato c: listaContato){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                c.setNome(nome);
            }
        }
    }

    



}
