package Nivell3.Noticies;

public abstract class Noticia {
    private String titular;
    private String text = "";
    private int puntuacio;
    private double preu;

    public Noticia(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public abstract void calcularPreuNoticia();
    public abstract void calcularPuntuacioNoticia();
}
