public class Conteudo {
    
    public static void main(String[] args) {
        
        Caixa<String> conteudoString = new Caixa<>();
        Caixa<Integer> conteudoInt = new Caixa<>();

        conteudoInt.alimentarCaixa(10);
        conteudoString.alimentarCaixa("hello");

        System.out.println(conteudoInt.pegaCaixa());
        System.out.println(conteudoString.pegaCaixa());

    }
}
