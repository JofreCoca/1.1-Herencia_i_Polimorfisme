package Nivell_2_Exercici_1.Moduls;

public class Smartphone extends Telefon implements Camera,Rellotge{

    public Smartphone(String marca,String model){
        super(marca,model);
    }
    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }
}
