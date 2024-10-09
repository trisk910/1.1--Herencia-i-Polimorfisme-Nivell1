package Nivell3.Noticies;

public class Motociclisme extends Noticia{

    private String equip;

    public Motociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 100;

        if (equip.contains("Honda") || equip.contains("Yamaha")) {
            preu += 50;
        }

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 3;

        if (equip.contains("Honda") || equip.contains("Yamaha")) {
            puntuacio += 3;
        }

        setPuntuacio(puntuacio);
    }
}