package conceitosFundamentais;

public class Cachorro implements AnimalInterface {

    @Override
    public void som() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void dormir() {
        // TODO Auto-generated method stub
        AnimalInterface.super.dormir();
    }


}
