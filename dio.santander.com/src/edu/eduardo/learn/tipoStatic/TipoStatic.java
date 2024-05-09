package edu.eduardo.learn.tipoStatic;

import java.util.concurrent.ConcurrentHashMap;

public class TipoStatic {

    // Quando criamos uma instancia do tipo 'Static', qualquer ponteiro vai se referenciar a apenas um end-point na memória, segue exemplo: 

    static int contador = 0;

    private Contador(){
        contador++;
    }
    
    public static void main(String[] args) {
        
        int obj1 = new TipoStatic();

    }
}
