package Nivell_3_Exeercici_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Redactor> redactors = new ArrayList<Redactor>();

        boolean sortir = false;

        do{
            switch(menu()){
                case 0:
                    System.out.println("Gràcies per utilitzar el programa");
                    sortir = true;
                    break;
                case 1:
                    introduirRedactor(redactors);
                    System.out.println(redactors);
                    break;
                case 2:
                    eliminarRedactor(redactors);
                    System.out.println(redactors);
                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
            }
        }while(!sortir);
    }

    public static byte menu(){
        Scanner entradaTeclat = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO =7;
        do{
            System.out.println("\nMenú");
            System.out.println("0.- Sortir de l'aplicació.");
            System.out.println("1.- Introduir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introduir notícia a un redactor.");
            System.out.println("4.- Eliminar notícia.");
            System.out.println("5.- Mostrar totes les notícies per redactor.");
            System.out.println("6.- Calcular puntuació de la noticia.");
            System.out.println("7.- Calcular preu-notícia.\n");
            opcio = entradaTeclat.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static void introduirRedactor(ArrayList<Redactor> redactors){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el nom del redactor");
        String nom= entradaTeclat.nextLine();
        System.out.println("Introdueix el DNI del redactor");
        String dni= entradaTeclat.nextLine();
        Redactor redactor = buscarRedactor(redactors,dni);
        if(redactor==null){
            redactors.add(new Redactor(nom,dni));
        }else{
            System.out.println("El redactor ja existeix");
        }
    }

    public static void eliminarRedactor(ArrayList<Redactor> redactors){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el DNI del redactor");
        String dni= entradaTeclat.nextLine();
        Redactor redactor = buscarRedactor(redactors,dni);
        if(redactor==null){
            System.out.println("No existeix aquest redactor");
        }else{
            redactors.remove(redactor);
        }
    }

    public static Redactor buscarRedactor(ArrayList<Redactor> redactors,String DNI){
        Redactor redactor = null;
        int i=0;
        int size=redactors.size();
        while(i<size && redactor==null){
            if(redactors.get(i).getDNI().equalsIgnoreCase(DNI)){
                redactor=redactors.get(i);
            }
            i++;
        }
        return redactor;
    }
}
