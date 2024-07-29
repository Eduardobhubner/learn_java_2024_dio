package exercicioSet;

public class Convidado {


    private String nome;
    private int numeroConvidado;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConvidado() {
        return numeroConvidado;
    }

    public void setNumeroConvidado(int numeroConvidado) {
        this.numeroConvidado = numeroConvidado;
    }

    public Convidado(String nome, int numeroConvidado) {
        this.nome = nome;
        this.numeroConvidado = numeroConvidado;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", numeroConvidado=" + numeroConvidado +
                '}';
    }
}
