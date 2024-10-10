package Nivell3.Noticies;

import Nivell3.Redactor;

import java.util.ArrayList;
import java.util.Scanner;

public class UiController {
    public void StartMenu(){
        ArrayList<Redactor> redactors = new ArrayList<>();

        Scanner scnMenu = new Scanner(System.in);
        int opcioMenu  = 0;
        while(opcioMenu !=8) {
            System.out.println("\n1.- Introduir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introduir notícia a un redactor.");
            System.out.println("4.- Eliminar notícia");
            System.out.println("5.- Mostrar totes les notícies per redactor.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular preu-notícia.");
            System.out.println("8.- Sortir.\n");
            System.out.print("Opció: ");
            try {
                opcioMenu = Integer.parseInt(scnMenu.nextLine());
                if (opcioMenu < 1 || opcioMenu > 8)
                    System.out.println("Opció Invàlida\n");
                else {
                    switch (opcioMenu){
                        case 1:
                            System.out.print("Introduir nom: ");
                            Scanner scnMenuR = new Scanner(System.in);
                            String nom = scnMenuR.nextLine();
                            System.out.print("Introduir dni: ");
                            String dni = scnMenuR.nextLine();
                            redactors.add(new Redactor(nom,dni));
                            break;
                        case 2:
                            System.out.print("Introduir nom del redactor: ");
                            Scanner scnMenuE = new Scanner(System.in);
                            String nomRedactor = scnMenuE.nextLine();
                            eliminarRedactor(redactors, nomRedactor);
                            break;
                        case 3:
                            if(redactors.size()<1){
                                System.out.println("No existeix cap redactor!");
                            }else{
                                System.out.print("Introduir nom del redactor: ");
                                Scanner scnMenuN = new Scanner(System.in);
                                String cercaRedactor = scnMenuN.nextLine();
                                Redactor redactor = trobarRedactor(redactors, cercaRedactor);
                                if (redactor != null)
                                    afegirNoticia(redactor);
                            }
                            break;
                        case 4:
                            System.out.print("Introduir nom del redactor: ");
                            Scanner scnMenuEN = new Scanner(System.in);
                            String nomRedactorEliminar = scnMenuEN.nextLine();
                            Redactor redactorEliminar = trobarRedactor(redactors, nomRedactorEliminar);
                            if (redactorEliminar != null) {
                                redactorEliminar.mostrarNoticies();
                                System.out.print("Selecciona el número de la notícia a eliminar: ");
                                int indexEliminar = Integer.parseInt(scnMenuEN.nextLine());
                                redactorEliminar.eliminarNoticia(indexEliminar);
                            }
                            break;
                        case 5:
                            System.out.print("Introduir nom del redactor: ");
                            Scanner scnMenuTN = new Scanner(System.in);
                            String nomRedactorMostrar = scnMenuTN.nextLine();
                            Redactor redactorMostrar = trobarRedactor(redactors, nomRedactorMostrar);
                            if (redactorMostrar != null) {
                                redactorMostrar.mostrarNoticies();
                            }
                            break;
                        case 6:
                            System.out.print("Introduir nom del redactor: ");
                            Scanner scnMenuCN = new Scanner(System.in);
                            String nomRedactorPuntuacio = scnMenuCN.nextLine();
                            Redactor redactorPuntuacio = trobarRedactor(redactors, nomRedactorPuntuacio);
                            if (redactorPuntuacio != null) {
                                redactorPuntuacio.mostrarNoticies();
                                System.out.print("Selecciona el número de la notícia: ");
                                Scanner scnMenuPN = new Scanner(System.in);
                                int indexPuntuacio = Integer.parseInt(scnMenuPN.nextLine());
                                redactorPuntuacio.calcularPuntuacioNoticia(indexPuntuacio);
                            }
                            break;
                        case 7:
                            System.out.print("Introduir nom del redactor: ");
                            Scanner scnMenuCP = new Scanner(System.in);
                            String nomRedactorPreu = scnMenuCP.nextLine();
                            Redactor redactorPreu = trobarRedactor(redactors, nomRedactorPreu);
                            if (redactorPreu != null) {
                                redactorPreu.mostrarNoticies();
                                System.out.print("Selecciona el número de la notícia: ");
                                int indexPreu = Integer.parseInt(scnMenuCP.nextLine());
                                redactorPreu.calcularPreuNoticia(indexPreu);
                            }
                            break;
                    }

                }
            }catch (Exception e){
                System.out.println("Opció Invàlida");
            }
        }
    }
    private static void eliminarRedactor(ArrayList<Redactor> redactors, String nomRedactor) {
        boolean redactorTrobat = false;
        for (int i = 0; i < redactors.size(); i++) {
            if (redactors.get(i).getNom().equalsIgnoreCase(nomRedactor)) {
                redactors.remove(i);
                redactorTrobat = true;
                System.out.println("Redactor eliminat.");
                i = redactors.size();
            }
        }
        if (!redactorTrobat) {
            System.out.println("Redactor no trobat.");
        }
    }
    private static Redactor trobarRedactor(ArrayList<Redactor> redactors, String nomRedactor) {
        for (Redactor redactor : redactors) {
            if (redactor.getNom().equalsIgnoreCase(nomRedactor)) {
                return redactor;
            }
        }
        System.out.println("Redactor no trobat.");
        return null;
    }

    private static void afegirNoticia(Redactor redactor) {
        String tipusNoticia = "";
        Scanner scnMenuRN = new Scanner(System.in);
        boolean tipusOK = false;
        while (!tipusOK) {
            System.out.print("Introduir tipus de notícia (futbol/basquet/f1/motociclisme/tenis): ");
            tipusNoticia = scnMenuRN.nextLine();

            if(tipusNoticia.equals("futbol") || tipusNoticia.equals("basquet") || tipusNoticia.equals("f1") || tipusNoticia.equals("motociclisme") || tipusNoticia.equals("tenis")) {
                tipusOK = true;
            }else{
                System.out.println("Tipus de noticia incorrecte");
            }
        }
        System.out.print("Introduir titular de la notícia: ");
        String titular = scnMenuRN.nextLine();

        switch (tipusNoticia) {
            case "futbol":
                Scanner scnMenuNF = new Scanner(System.in);
                System.out.print("Introduir competició: ");
                String competicioFutbol = scnMenuNF.nextLine();
                System.out.print("Introduir club: ");
                String club = scnMenuNF.nextLine();
                System.out.print("Introduir jugador: ");
                String jugador = scnMenuNF.nextLine();
                redactor.afegirNoticia(new Futbol(titular, competicioFutbol, club, jugador));
                break;

            case "basquet":
                Scanner scnMenuNB = new Scanner(System.in);
                System.out.print("Introduir competició: ");
                String competicioBasquet = scnMenuNB.nextLine();
                System.out.print("Introduir club: ");
                String clubBasquet = scnMenuNB.nextLine();
                redactor.afegirNoticia(new Basquet(titular, competicioBasquet,clubBasquet));
                break;

            case "f1":
                Scanner scnMenuNF1 = new Scanner(System.in);
                System.out.print("Introduir equip: ");
                String equipF1 = scnMenuNF1.nextLine();
                redactor.afegirNoticia(new F1(titular, equipF1));
                break;

            case "motociclisme":
                Scanner scnMenuNM = new Scanner(System.in);
                System.out.print("Introduir equip: ");
                String equipMoto = scnMenuNM.nextLine();
                redactor.afegirNoticia(new Motociclisme(titular, equipMoto));
                break;

            case "tenis":
                Scanner scnMenuNT = new Scanner(System.in);
                System.out.print("Introduir Competicio: ");
                String competicio = scnMenuNT.nextLine();
                System.out.print("Introduir jugadors: ");
                String jugadorTenis = scnMenuNT.nextLine();
                redactor.afegirNoticia(new Tenis(titular,competicio, jugadorTenis));
                break;

            default:
                System.out.println("Tipus de notícia no vàlid.");
                break;
        }

    }
}
