package Nivell_2_Exercici_1;

public class Telefon {

    private String marca;
    private String model;

    public Telefon(String marca,String model){
        this.marca=marca;
        this.model=model;
    }

    public void trucar(String numeroTelefon){

        System.out.println("S'està trucant al número "+numeroTelefon);
    }
}
