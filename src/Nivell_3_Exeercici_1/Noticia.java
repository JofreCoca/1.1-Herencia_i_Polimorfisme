package Nivell_3_Exeercici_1;

public abstract class Noticia {

    private String titular;
    private String text;
    private float puntuacio;
    private float preu;

    public Noticia(String titular){
        this.titular=titular;
        this.text="";
        this.puntuacio=0f;
        this.preu=0f;
    }

    public abstract float calcularPreuNoticia();

    public abstract float calcularPuntuacio();


}
