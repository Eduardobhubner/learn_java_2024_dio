package conceitosPoo;

public abstract class Veiculo {

    private int chassi;

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    /**Quando se define um metodo como abstract, todas as classes que 
     * fazer herança desta classe, deve ter o metodo ligar especificando seu
     * modo operante de ligar o veiculo
     */
    public abstract void ligar();

}
