package Nivell3;

import Nivell3.Noticies.Basquet;
import Nivell3.Noticies.F1;
import Nivell3.Noticies.Noticia;

import java.util.ArrayList;

public class Redactor {

    private String nom;
    private String dni;
    private double sou = 1500;

    private ArrayList<Basquet> noticiesBasquet;
    private ArrayList<F1> noticiesF1;


    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public double getSou() {
        return sou;
    }

   public void addNoticiesBasquet(String titular, String text){
        String competicio = "";
        String club = "";
        if(text.contains("Eurolliga"))
            competicio = "Eurolliga";
        else if(text.contains("ACB"))
            competicio = "ACB";
        else if(text.contains("Barça"))
            club = "Barça";
        else if(text.contains("Madrid"))
            club = "Barça";
       noticiesBasquet.add(new Basquet(titular,text,competicio,club));
   }
}
