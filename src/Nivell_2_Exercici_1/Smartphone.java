package Nivell_2_Exercici_1;

public class Smartphone extends Telefon implements Camera,Rellotge{

    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }
}
