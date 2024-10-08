package Nivell2;


public class MainNivell2 {
    public static void main(String[] args) {
        Smartphone nouSmartphone = new Smartphone("Samsung","Galaxy 2");
        System.out.println("Telefon: " + nouSmartphone.getMarca() + "\t" + nouSmartphone.getModel());
        nouSmartphone.Alarma();
        nouSmartphone.Fotografiar();
        String missatge = "Hola";
        nouSmartphone.Trucar(missatge);
    }
}
