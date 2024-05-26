package conceitosPoo;

public class Autodromo {

    public static void main(String[] args) {
        Carro duster = new Carro();
        Moto z400 = new Moto();

        duster.setChassi(123123123);
        z400.setChassi(1234123);

        System.out.println(duster.getChassi());
        System.out.println(z400.getChassi());
    }
}