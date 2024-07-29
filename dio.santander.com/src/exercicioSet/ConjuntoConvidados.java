package exercicioSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> listaConvidado;

    public ConjuntoConvidados() {
        this.listaConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        listaConvidado.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for (Convidado c: listaConvidado){
            if(c.getNumeroConvidado() == codigoConvite){
                listaConvidado.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return listaConvidado.size();
    }

    public void exibirConvidados(){

        for (Convidado c : listaConvidado){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados");
        conjuntoConvidados.adicionarConvidado("Eduardo", 123);
        conjuntoConvidados.adicionarConvidado("Katherina",123);
        conjuntoConvidados.adicionarConvidado("Katherina",123);


        conjuntoConvidados.adicionarConvidado("Eduardo",123);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados");

        conjuntoConvidados.exibirConvidados();


    }


}
