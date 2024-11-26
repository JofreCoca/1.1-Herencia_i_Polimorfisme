package Nivell_3_Exeercici_1.Main;

import Nivell_3_Exeercici_1.Moduls.*;

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
                    introduirNoticia(redactors);
                    break;
                case 4:
                    eliminarNoticia(redactors);
                    break;
                case 5:
                    String dni=recullirDniTeclat();
                    Redactor redactor=buscarRedactor(redactors,dni);
                    if(redactor!=null){
                        MostrarTotesLesNotíciesPerRedactor(redactor);
                    }
                    break;
                case 6:
                    System.out.println("La puntuació és: "+CalcularPuntuacióNoticia(redactors));
                    break;
                case 7:
                    System.out.println("La preu de la noticia és: "+CalcularPreuNoticia(redactors));
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
        String dni= recullirDniTeclat();
        Redactor redactor = buscarRedactor(redactors,dni);
        if(redactor==null){
            redactors.add(new Redactor(nom,dni));
        }else{
            System.out.println("El redactor ja existeix");
        }
    }

    public static void eliminarRedactor(ArrayList<Redactor> redactors){
        Redactor redactor = buscarRedactor(redactors,recullirDniTeclat());
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

    public static void introduirNoticia(ArrayList<Redactor> redactors){
        Redactor redactor = buscarRedactor(redactors,recullirDniTeclat());
        if(redactor==null){
            System.out.println("Aquest redactor no existeix");
        }else{
            ArrayList<Noticia> noticies = redactor.getNoticies();

            switch(menuNoticia()){
                case 1:
                    String titular=recullirTitularTeclat();
                    Noticia noticia = buscarNoticia(noticies,titular);
                    if(noticia==null){
                        noticies.add(new NoticiaFutbol(titular,recullirCompeticioTeclat(),recullirClubTeclat(),recullirJugadorTeclat()));
                    }else{
                        System.out.println("La noticia ja existeix");
                    }
                    break;
                case 2:
                    titular=recullirTitularTeclat();
                    noticia = buscarNoticia(noticies,titular);
                    if(noticia==null){
                        noticies.add(new NoticiaBasquet(titular,recullirCompeticioTeclat(),recullirClubTeclat()));
                    }else{
                        System.out.println("La noticia ja existeix");
                    }
                    break;
                case 3:
                    titular=recullirTitularTeclat();
                    noticia = buscarNoticia(noticies,titular);
                    if(noticia==null){
                        noticies.add(new NoticiaTenis(titular,recullirCompeticioTeclat(),recullirTenistaTeclat()));
                    }else{
                        System.out.println("La noticia ja existeix");
                    }
                    break;
                case 4:
                    titular=recullirTitularTeclat();
                    noticia = buscarNoticia(noticies,titular);
                    if(noticia==null){
                        noticies.add(new NoticiaF1(titular,recullirEscuderiaTeclat()));
                    }else{
                        System.out.println("La noticia ja existeix");
                    }
                    break;
                case 5:
                    titular=recullirTitularTeclat();
                    noticia = buscarNoticia(noticies,titular);
                    if(noticia==null){
                        noticies.add(new NoticiaMotociclisme(titular,recullirEquipTeclat()));
                    }else{
                        System.out.println("La noticia ja existeix");
                    }
                    break;
            }
        }
    }

    public static void eliminarNoticia(ArrayList<Redactor> redactors){
        Redactor redactor = buscarRedactor(redactors,recullirDniTeclat());
        if(redactor==null){
            System.out.println("Aquest redactor no existeix");
        }else{
            String titular=recullirTitularTeclat();
            ArrayList<Noticia> noticies =redactor.getNoticies();
            Noticia noticia = buscarNoticia(noticies,titular);
            if(noticia==null){
                System.out.println("Aquesta noticia no existeix");
            }else {
                noticies.remove(noticia);
            }
        }
    }

    public static void MostrarTotesLesNotíciesPerRedactor(Redactor redactor){
        ArrayList<Noticia> noticies =redactor.getNoticies();
        for (Noticia lecturaArrayNoticies : noticies) {
            System.out.println(noticies);
        }
    }

    public static byte menuNoticia(){
        Scanner entradaTeclat = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 1;
        final byte MAXIMO =5;
        do{
            System.out.println("\nMenú noticia");
            System.out.println("1.- Noticia de futbol.");
            System.out.println("2.- Noticia de basquet.");
            System.out.println("3.- Noticia de tenis.");
            System.out.println("4.- Noticia de F1.");
            System.out.println("5.- Noticia motociclisme.");
            opcio = entradaTeclat.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static Noticia buscarNoticia(ArrayList<Noticia> noticies,String titular){
        Noticia noticia = null;
        int i=0;
        int size=noticies.size();
        while(i<size && noticia==null){
            if(noticies.get(i).getTitular().equalsIgnoreCase(titular)){
                noticia=noticies.get(i);
            }
            i++;
        }
        return noticia;
    }

    public static float CalcularPuntuacióNoticia(ArrayList<Redactor> redactors){
        float puntuacio=0;
        Redactor redactor = buscarRedactor(redactors,recullirDniTeclat());
        if(redactor==null){
            System.out.println("Aquest redactor no existeix");
        }else{
            String titular=recullirTitularTeclat();
            ArrayList<Noticia> noticies =redactor.getNoticies();
            Noticia noticia = buscarNoticia(noticies,titular);
            if(noticia==null){
                System.out.println("Aquesta noticia no existeix");
            }else {
                puntuacio=noticia.calcularPuntuacio();
            }
        }
        return puntuacio;
    }

    public static float CalcularPreuNoticia(ArrayList<Redactor> redactors){
        float preu=0;
        Redactor redactor = buscarRedactor(redactors,recullirDniTeclat());
        if(redactor==null){
            System.out.println("Aquest redactor no existeix");
        }else{
            String titular=recullirTitularTeclat();
            ArrayList<Noticia> noticies =redactor.getNoticies();
            Noticia noticia = buscarNoticia(noticies,titular);
            if(noticia==null){
                System.out.println("Aquesta noticia no existeix");
            }else {
                preu=noticia.calcularPreuNoticia();
            }
        }
        return preu;
    }

    public static String recullirDniTeclat(){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el DNI del redactor");
        return entradaTeclat.nextLine();
    }

    public static String recullirTitularTeclat(){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el titular de la noticia");
        return entradaTeclat.nextLine();
    }

    public static String recullirCompeticioTeclat(){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el nom de la competició");
        return entradaTeclat.nextLine();
    }

    public static String recullirClubTeclat(){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el nom del club");
        return entradaTeclat.nextLine();
    }

    public static String recullirJugadorTeclat(){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el nom del jugador");
        return entradaTeclat.nextLine();
    }

    public static String recullirTenistaTeclat(){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el nom del tenista");
        return entradaTeclat.nextLine();
    }

    public static String recullirEscuderiaTeclat(){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el nom de l'escuderia");
        return entradaTeclat.nextLine();
    }

    public static String recullirEquipTeclat(){
        Scanner entradaTeclat = new Scanner(System.in);
        System.out.println("Introdueix el nom de l'equip");
        return entradaTeclat.nextLine();
    }
}
