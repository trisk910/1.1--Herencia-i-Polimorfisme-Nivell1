package Nivell2;

public class Telefon {
    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void Trucar(String missatge){
        System.out.println("Missatge rebut: " + missatge);
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }
}
