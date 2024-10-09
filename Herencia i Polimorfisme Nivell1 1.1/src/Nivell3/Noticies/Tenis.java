package Nivell3.Noticies;

public class Tenis extends Noticia{

    private String competicio;
    private String tenistes;

    public Tenis(String titular, String competicio, String tenistes) {
        super(titular);
        this.competicio = competicio;
        this.tenistes = tenistes;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 150;

        if (tenistes.contains("Federer") || tenistes.contains("Nadal") || tenistes.contains("Djokovic")) {
            preu += 100;
        }

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 4;

        if (tenistes.contains("Federer") || tenistes.contains("Nadal") || tenistes.contains("Djokovic")) {
            puntuacio += 3;
        }

        setPuntuacio(puntuacio);
    }
}
