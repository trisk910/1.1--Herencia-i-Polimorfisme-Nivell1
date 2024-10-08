package Nivell2;

public interface Rellotge {

    default void Alarma(){
        System.out.println("Esta sonant l'alarma");
    }
}
