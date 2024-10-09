package Nivell3.Noticies;

public class Basquet extends Noticia{
    private String competicio;
    private String club;

    public Basquet(String titular, String text,String competicio, String club) {
        super(titular, text);
        this.competicio = competicio;
        this.club = club;
    }
}
