package Nivell3;

import Nivell3.Noticies.Noticia;

import java.util.ArrayList;

public class Redactor {
    private String nom;
    private String dni;
    private static double sou = 1500;
    private ArrayList<Noticia> noticies;

    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
        this.noticies = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public static double getSou() {
        return sou;
    }

    public static void setSou(double nouSou) {
        sou = nouSou;
    }

    public void afegirNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public void eliminarNoticia(int index) {
        if (index >= 0 && index < noticies.size()) {
            noticies.remove(index);
        } else {
            System.out.println("Notícia no trobada!");
        }
    }

    public void mostrarNoticies() {
        if (noticies.isEmpty()) {
            System.out.println("Aquest redactor no té notícies.");
        } else {
            for (int i = 0; i < noticies.size(); i++) {
                System.out.println(i + ". " + noticies.get(i).getTitular());
            }
        }
    }

    public void calcularPreuNoticia(int index) {
        if (index >= 0 && index < noticies.size()) {
            Noticia noticia = noticies.get(index);
            noticia.calcularPreuNoticia();
            System.out.println("Preu de la notícia: " + noticia.getPreu() + " €");
        } else {
            System.out.println("Notícia no trobada!");
        }
    }

    public void calcularPuntuacioNoticia(int index) {
        if (index >= 0 && index < noticies.size()) {
            Noticia noticia = noticies.get(index);
            noticia.calcularPuntuacioNoticia();
            System.out.println("Puntuació de la notícia: " + noticia.getPuntuacio() + " punts");
        } else {
            System.out.println("Notícia no trobada!");
        }
    }
}
