package Nivell_1_Exercici_1.Moduls;

public class InstrumentCorda extends Instrument {

    public InstrumentCorda(String nom, float preu){
        super(nom, preu);
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }
}
