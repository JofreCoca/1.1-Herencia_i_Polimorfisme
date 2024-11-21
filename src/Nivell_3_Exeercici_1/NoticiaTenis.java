package Nivell_3_Exeercici_1;

public class NoticiaTenis extends Noticia{

    private String competicio;
    private String tenistes;

    public NoticiaTenis(String titular,String competicio,String tenistes){
        super(titular);
        this.competicio=competicio;
        this.tenistes=tenistes;
    }

    public float calcularPreuNoticia() {
        float preu = 150f;
        if((tenistes.toLowerCase().indexOf("federer")>-1)
                ||(tenistes.toLowerCase().indexOf("nadal")>-1)
                ||(tenistes.toLowerCase().indexOf("djokovic")>-1)){preu+=100f;}
        return preu;
    }

    public float calcularPuntuacio() {
        float punts=4;
        if((tenistes.toLowerCase().indexOf("federer")>-1)
                ||(tenistes.toLowerCase().indexOf("nadal")>-1)
                ||(tenistes.toLowerCase().indexOf("djokovic")>-1)){punts+=3f;}
        return punts;
    }
}
