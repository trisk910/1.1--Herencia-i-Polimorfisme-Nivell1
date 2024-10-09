package Nivell3.Noticies;

public class Tenis extends Noticia{

    private String competicio;
    private String tenistes;

    public Tenis(String titular, String text,String competicio, String tenistes) {
        super(titular, text);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }
}
