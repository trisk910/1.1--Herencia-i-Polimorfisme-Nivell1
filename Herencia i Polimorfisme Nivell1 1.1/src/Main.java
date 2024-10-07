import Exercici1.Corda;
import Exercici1.Percussio;
import Exercici1.Vent;

public class Main {
    public static void main(String[] args) {

        System.out.println("EXERCICI 1\n");
        Vent instrumentVent1 = new Vent("flauta",60);
        Corda instrumentCorda1 = new Corda("guitarra",100);
        Percussio instrumentPercussio1 = new Percussio("tambor",40);

        instrumentVent1.Tocar();
        instrumentCorda1.Tocar();
        instrumentPercussio1.Tocar();

        System.out.println("\nEXERCICI 2\n");
    }

}