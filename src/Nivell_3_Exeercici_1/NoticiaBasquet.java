package Nivell_3_Exeercici_1;

public class NoticiaBasquet extends Noticia{

    private String competicio;
    private String club;

    public NoticiaBasquet(String titular,String competicio,String club){
        super(titular);
        this.competicio=competicio;
        this.club=club;
    }

    public float calcularPreuNoticia() {
        float preu = 250f;
        if(competicio.equalsIgnoreCase("Lliga de Campions")){preu+=75f;}
        if(club.equalsIgnoreCase("Barça")||club.equalsIgnoreCase("Madrid")){preu+=75f;}
        super.setPreu(preu);
        return preu;
    }

    public float calcularPuntuacio() {
        float punts=4;
        if(competicio.equalsIgnoreCase("Eurolliuga")){punts+=3f;}
        if(competicio.equalsIgnoreCase("ACB")){punts+=2f;}
        if(club.equalsIgnoreCase("Barça")||club.equalsIgnoreCase("Madrid")){punts+=1f;}
        super.setPuntuacio(punts);
        return punts;
    }
}
