package Nivell_3_Exeercici_1;

public class NoticiaF1 extends Noticia{

    private String escuderia;

    public NoticiaF1(String titular,String escuderia){
        super(titular);
        this.escuderia=escuderia;
    }

    public float calcularPreuNoticia() {
        float preu = 100f;
        if(escuderia.equalsIgnoreCase("Ferrari")||escuderia.equalsIgnoreCase("Mercedes")){preu+=50f;}
        super.setPreu(preu);
        return preu;
    }

    public float calcularPuntuacio() {
        float punts=4;
        if(escuderia.equalsIgnoreCase("Ferrari")||escuderia.equalsIgnoreCase("Mercedes")){punts+=2f;}
        super.setPuntuacio(punts);
        return punts;
    }
}
