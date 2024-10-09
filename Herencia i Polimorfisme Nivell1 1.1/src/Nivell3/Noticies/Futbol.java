package Nivell3.Noticies;

public class Futbol extends Noticia{

    private String competicio;
    private String club;
    private String jugador;

    public Futbol(String titular, String text, String competicio, String club, String jugador) {
        super(titular, text);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }
}
