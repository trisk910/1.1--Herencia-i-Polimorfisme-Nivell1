package Nivell3.Noticies;

public class Noticia {
    private String titular;
    private String text = "";
    private int punctuacio;
    private double preu;

    public Noticia(String titular, String text) {
        this.titular = titular;
        this.text = text;
        calcularPreuNoticia(text);
    }

    public void calcularPreuNoticia(String textNoticia){

    }

    public int getPunctuacio() {
        return punctuacio;
    }

    public void setPunctuacio(int punctuacio) {
        this.punctuacio = punctuacio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
}
