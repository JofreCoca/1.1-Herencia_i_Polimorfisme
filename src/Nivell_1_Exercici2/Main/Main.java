package Nivell_1_Exercici2.Main;

import Nivell_1_Exercici2.Moduls.Cotxe;

public class Main {

    public static void main(String[] args) {

        System.out.println("Invoco el mètode estàtic frenar() des de la classe:");
        Cotxe.frenar();
        Cotxe cotxe=new Cotxe(1200);
        System.out.println("Invoco el mètode no estàtic accelerar() des de l'objecte:");
        cotxe.accelerar();

        Cotxe cotxe2=new Cotxe(1500);
        Cotxe.setModel("Fiesta V2");
        System.out.println("Modifico l'atribut static de la classe Cotxei verifico en dos objectes:");
        System.out.println("Coche 1: "+cotxe.getModel());
        System.out.println("Coche 2: "+cotxe2.getModel());
    }
}