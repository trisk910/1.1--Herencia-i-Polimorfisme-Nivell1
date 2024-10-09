package Nivell3.Noticies;

public class Motociclisme extends Noticia{

    private String equip;

    public Motociclisme(String titular, String text, String equip) {
        super(titular, text);
        this.equip = equip;
    }
}
