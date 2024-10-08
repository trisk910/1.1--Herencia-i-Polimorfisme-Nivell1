package Nivell1.Exercici1;

import Nivell1.Exercici1.Instrument;

public class Corda extends Instrument {

    {//instance code block
        System.out.println("Creant un instrument de corda");
    }
    static{
        System.out.println("S'ha creat el instrument de corda");
    }

    public Corda(String nom, float preu) {
        super(nom,preu);
    }

    public void Tocar(){
        System.out.println("Està sonant un instrument de corda");
    }
}
