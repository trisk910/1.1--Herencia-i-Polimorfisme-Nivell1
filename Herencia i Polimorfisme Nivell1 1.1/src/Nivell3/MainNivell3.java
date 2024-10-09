package Nivell3;

import Nivell3.Noticies.Basquet;
import Nivell3.Noticies.Noticia;

import java.util.ArrayList;
import java.util.Scanner;

public class MainNivell3 {
    public static void main(String[] args) {
        ArrayList<Redactor> redactors = new ArrayList<>();
        ArrayList<Noticia> noticies = new ArrayList<>();

        Scanner scnMenu = new Scanner(System.in);
        int opcioMenu  = 0;
        while(opcioMenu !=8) {
            System.out.println("1.- Introduir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introduir notícia a un redactor.");
            System.out.println("4.- Eliminar notícia");
            System.out.println("5.- Mostrar totes les notícies per redactor.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular preu-notícia.");
            System.out.println("8.- Sortir.\n");
            System.out.print("Opcio: ");
            try {
                opcioMenu = Integer.parseInt(scnMenu.nextLine());
                if (opcioMenu < 1 || opcioMenu > 8)
                    System.out.println("Opció Invàldia\n");
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
                            String nomR = scnMenuE.nextLine();
                            boolean redactorFound = false;
                            int indexRedactor = 0;
                            for(int i = 0; i< redactors.size();i++){
                                if(redactors.get(i).getNom().contains(nomR)){
                                    indexRedactor = i;
                                    i = redactors.size();
                                    redactorFound = true;
                                }
                            }
                            if(redactorFound){
                                redactors.remove(indexRedactor);
                                System.out.println("Redactor eliminat!\n");
                            }else{
                                System.out.println("Redactor no trobat!\n");
                            }
                            break;
                        case 3:
                            if(redactors.size()<1){
                                System.out.println("No existeix cap redactor!\n");
                            }else{
                                System.out.print("Introduir nom del redactor: ");
                                Scanner scnMenuN = new Scanner(System.in);
                                String nomR2 = scnMenuN.nextLine();
                                boolean redactorFound2 = false;
                                int redactorPos = 0;
                                for(int i = 0; i< redactors.size();i++){
                                    if(redactors.get(i).getNom().contains(nomR2)){
                                        redactorFound2 = true;
                                        redactorPos = i;
                                    }
                                }
                                if(redactorFound2){
                                    System.out.print("Introduir tipus noticia[basquet/f1/futbol/motociclisme/tenis]: ");
                                    Scanner scnMenuN2 = new Scanner(System.in);
                                    String tipusN = scnMenuN2.nextLine();
                                    switch(tipusN){
                                        case "basquet":
                                            System.out.print("Introduir titular: ");
                                            Scanner scnMenuB = new Scanner(System.in);
                                            String nomTB = scnMenuB.nextLine();
                                            System.out.print("Introduir el text de la noticia: ");
                                            String noticiaB = scnMenuB.nextLine();

                                            redactors.get(redactorPos).addNoticiesBasquet(nomTB,noticiaB);
                                            break;
                                        case "f1":
                                            break;
                                        case "futbol":
                                            break;
                                        case "motociclisme":
                                            break;
                                        case "tenis":
                                            break;
                                        default:System.out.println("Categoria no trobada!\n");
                                    }
                                }else{
                                    System.out.println("Redactor no trobat!\n");
                                }
                            }
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                    }

                }
            }catch (Exception e){
                    System.out.println("Opció Invàldia");
                }
        }
    }
}
