package edu.eduardo.learn.classe;

public class TipoClasse {
    public static void main(String[] args) {
        String nome = "Eduardo";
        String sobreNome = "Hubner";
        String nomeCompleto = NomeCompleto(nome, sobreNome);
        String aprovacao = ValidaNota(6);

        String[] nomes = { "Eduardo", "Katherina" };

        System.out.println(nomeCompleto);
        System.out.println(aprovacao);
    }

    public static String NomeCompleto(String nome, String sobreNome) {
        return nome.concat(" ").concat(sobreNome);
    }

    public static String ValidaNota(double nota) {

        if (nota > 6) {
            return ("Reprovado");
        } else if (nota == 6) {
            return ("Aprovado por pouco");
        } else {
            return ("Se deu Muito bem!");
        }
    }
}
