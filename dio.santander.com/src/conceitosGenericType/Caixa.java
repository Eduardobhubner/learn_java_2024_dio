public class Caixa<T>{

    private T conteudo;

    public void alimentarCaixa(T conteudo){
        this.conteudo = conteudo;
    }

    public T pegaCaixa(){
        return conteudo;
    }

    

}