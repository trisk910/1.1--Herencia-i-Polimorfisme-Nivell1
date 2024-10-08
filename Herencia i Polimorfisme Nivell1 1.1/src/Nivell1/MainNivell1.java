package Nivell1;

import Nivell1.Exercici1.Corda;
import Nivell1.Exercici2.Cotxe;
import Nivell1.Exercici1.Percussio;
import Nivell1.Exercici1.Vent;

public class MainNivell1 {
    public static void main(String[] args) {

        System.out.println("EXERCICI 1\n");
        Vent instrumentVent1 = new Vent("flauta",60);
        Corda instrumentCorda1 = new Corda("guitarra",100);
        Percussio instrumentPercussio1 = new Percussio("tambor",40);

        instrumentVent1.Tocar();
        instrumentCorda1.Tocar();
        instrumentPercussio1.Tocar();

        System.out.println("\nEXERCICI 2\n");
        Cotxe nouCotxe = new Cotxe(30);
        System.out.println("Marca del cotxe: "+ nouCotxe.getMarca() + "\n" + "Model del cotxe: " + nouCotxe.getModel());
        nouCotxe.accelerar();
        nouCotxe.frenar();

    }

}