
package conceitosFundamentais;

public interface AnimalInterface {

    void som();

    void comer();

    default void dormir() {
        System.out.println("O Animal esta dormindo");
    }

}