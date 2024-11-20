package Nivell_1_Exercici2.Moduls;

public class Cotxe {

    static final String MARCA="Ford";
    static String model;
    final int POTENCIA;

    public Cotxe(String model,int potencia) {
        this.model=model;
        System.out.println("Accés a un atribut estàtic d'aquesta classe en el contructor: "+this.model);
        this.POTENCIA = potencia;
        System.out.println("Accés a un atribut final d'aquesta classe en el contructor: "+this.POTENCIA);
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

    static{
        System.out.println("Accés a un membre estàtic final d'aquesta classe "+MARCA);
    }
}
