package Nivell_1_Exercici2.Moduls;

public class Cotxe {

    private static final String MARCA="Ford";
    private static String model="Fiesta";
    private final int POTENCIA;

    public Cotxe(int POTENCIA) {
        this.POTENCIA = POTENCIA;
        System.out.println(" Accés a un atribut final d'aquesta classe en el contructor: "+this.POTENCIA);
    }

    public static void frenar(){
        System.out.println(" El vehicle "+MARCA + " "+model+" està frenant");
    }

    public void accelerar(){
        System.out.println(" El vehicle "+MARCA + " "+model+" està accelerant");
    }

    static{
        System.out.println(" Accés a un membre estàtic final d'aquesta classe ");
    }
}
