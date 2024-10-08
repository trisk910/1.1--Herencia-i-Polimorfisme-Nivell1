package Exercici2;

public class Cotxe {

    private static final String marca = "honda";
    private static String model = "civic";
    private final float potencia;


    public Cotxe(float potencia) {
        this.potencia = potencia;
    }


    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public String getMarca() {
        return marca;
    }
    public String getModel(){
        return model;
    }
}
