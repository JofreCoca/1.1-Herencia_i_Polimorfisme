package Nivell_3_Exeercici_1;

import java.util.ArrayList;

public class Redactor {

    private String nom;
    private final String DNI;
    private static float sou = 1500f;
    private ArrayList<Noticia> noticies = new ArrayList<Noticia>();

    public Redactor(String nom,String DNI) {
       this.nom = nom;
       this.DNI = DNI;
       this.noticies=new ArrayList<Noticia>();
    }

    public String getDNI() {
        return DNI;
    }

    public String toString() {
        return "Redactor{" +
                "nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", noticies=" + noticies +
                '}';
    }
}
