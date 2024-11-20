package Nivell_1_Exercici2.Main;

import Nivell_1_Exercici2.Moduls.Cotxe;

public class Main {

    public static void main(String[] args) {

        System.out.println("Invoco el mètode estàtic frenar() des de la classe:");
        Cotxe.frenar();
        Cotxe cotxe=new Cotxe("Fiesta",1200);
        System.out.println("Invoco el mètode no estàtic accelerar() des de l'objecte:");
        cotxe.accelerar();
    }
}