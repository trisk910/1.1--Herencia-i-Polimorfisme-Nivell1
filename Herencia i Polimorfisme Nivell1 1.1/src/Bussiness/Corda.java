package Bussiness;

public class Corda extends Instrument{
    {
        System.out.println("Creant un instrument de corda");
    }

    public Corda(String nom, float preu) {
        super(nom,preu);
    }

    public void Tocar(){
        System.out.println("Està sonant un instrument de corda");
    }
}
