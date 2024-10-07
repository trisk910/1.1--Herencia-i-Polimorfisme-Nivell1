package Exercici1;

public abstract class Instrument {

    private String nom;
    private float preu;

    public Instrument(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public abstract void Tocar();
}
