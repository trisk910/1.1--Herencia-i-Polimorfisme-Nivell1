package Nivell3.Noticies;

public class F1 extends Noticia{

    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 100;

        if (escuderia.contains("Ferrari") || escuderia.contains("Mercedes")) {
            preu += 50;
        }

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 4;

        if (escuderia.contains("Ferrari") || escuderia.contains("Mercedes")) {
            puntuacio += 2;
        }

        setPuntuacio(puntuacio);
    }
}
