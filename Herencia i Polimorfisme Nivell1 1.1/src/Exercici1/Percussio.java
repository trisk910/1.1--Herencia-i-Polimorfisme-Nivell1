package Exercici1;

public class Percussio extends Instrument{

    {//instance code block
        System.out.println("Creant un instrument de percussio");
    }

    static{
        System.out.println("S'ha creat el instrument de percussio");
    }
    public Percussio(String nom, float preu) {
        super(nom,preu);
    }

    public void Tocar(){
        System.out.println("Està sonant un instrument de percussio");
    }
}
