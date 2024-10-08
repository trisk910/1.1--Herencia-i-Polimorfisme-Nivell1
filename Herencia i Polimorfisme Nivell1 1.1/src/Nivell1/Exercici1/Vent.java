package Nivell1.Exercici1;

public class Vent extends Nivell1.Exercici1.Instrument {

    {//instance code block
        System.out.println("Creant un instrument de vent");
    }
    static{
        System.out.println("S'ha creat el instrument de vent");
    }

    public Vent(String nom, float preu) {
        super(nom,preu);
    }

    public void Tocar(){
        System.out.println("Està sonant un instrument de vent");
    }
}
