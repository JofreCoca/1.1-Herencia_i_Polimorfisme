package Nivell_2_Exercici_1.Main;

import Nivell_2_Exercici_1.Moduls.Smartphone;

public class Main {

    public static void main(String[] args) {

        Smartphone smartphone=new Smartphone("Iphone","14");
        smartphone.trucar("555345825");
        smartphone.fotografiar();
        smartphone.alarma();
    }
}
