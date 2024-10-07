package Bussiness;

public class Percussio extends Instrument{
    {
        System.out.println("Creant un instrument de percussio");
    }

    public Percussio(String nom, float preu) {
        super(nom,preu);
    }

    public void Tocar(){
        System.out.println("Està sonant un instrument de percussio");
    }
}
