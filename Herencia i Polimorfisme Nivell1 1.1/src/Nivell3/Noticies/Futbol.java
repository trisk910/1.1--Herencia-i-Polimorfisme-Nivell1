package Nivell3.Noticies;

public class Futbol extends Noticia{

    private String competicio;
    private String club;
    private String jugador;

    public Futbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 300;

        if (competicio.contains("Lliga de Campions")) {
            preu += 100;
        }
        if (club.contains("Barça") || club.contains("Madrid")) {
            preu += 100;
        }
        if (jugador.contains("Ferran Torres") || jugador.contains("Benzema")) {
            preu += 50;
        }

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 5;

        if (competicio.contains("Lliga de Campions")) {
            puntuacio += 3;
        } else if (competicio.contains("Lliga")) {
            puntuacio += 2;
        }

        if (club.contains("Barça") || club.contains("Madrid")) {
            puntuacio += 1;
        }
        if (jugador.contains("Ferran Torres") || jugador.contains("Benzema")) {
            puntuacio += 1;
        }

        setPuntuacio(puntuacio);
    }
}
