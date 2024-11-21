package Nivell_3_Exeercici_1;

public class NoticiaFutbol extends Noticia{
    private String competicio;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular,String competicio,String club,String jugador){
        super(titular);
        this.competicio=competicio;
        this.club=club;
        this.jugador=jugador;
    }

    public float calcularPreuNoticia() {
        float preu = 300f;
        if(competicio.equalsIgnoreCase("Lliga de Campions")){preu+=100f;}
        if(club.equalsIgnoreCase("Barça")||club.equalsIgnoreCase("Madrid")){preu+=100f;}
        if(jugador.equalsIgnoreCase("Ferran Torres")||jugador.equalsIgnoreCase("Benzema")){preu+=50f;}
        super.setPreu(preu);
        return preu;
    }

    public float calcularPuntuacio() {
        float punts=5;
        if(competicio.equalsIgnoreCase("Lliga de Campions")){punts+=3f;}
        if(competicio.equalsIgnoreCase("Lliga")){punts+=2f;}
        if(club.equalsIgnoreCase("Barça")||club.equalsIgnoreCase("Madrid")){punts+=1f;}
        if(jugador.equalsIgnoreCase("Ferran Torres")||jugador.equalsIgnoreCase("Benzema")){punts+=1f;}
        super.setPuntuacio(punts);
        return punts;
    }
}
