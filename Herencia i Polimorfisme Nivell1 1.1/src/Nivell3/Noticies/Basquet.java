package Nivell3.Noticies;

public class Basquet extends Noticia{
    private String competicio;
    private String club;

    public Basquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 250;

        if (competicio.contains("Eurolliga")) {
            preu += 75;
        }
        if (club.contains("Barça") || club.contains("Madrid")) {
            preu += 75;
        }

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 4;

        if (competicio.contains("Eurolliga")) {
            puntuacio += 3;
        } else if (competicio.contains("ACB")) {
            puntuacio += 2;
        }

        if (club.contains("Barça") || club.contains("Madrid")) {
            puntuacio += 1;
        }

        setPuntuacio(puntuacio);
    }
}
