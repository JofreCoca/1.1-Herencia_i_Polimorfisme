package Nivell_3_Exeercici_1;

public class NoticiaMotociclisme extends Noticia{

    private String equip;

    public NoticiaMotociclisme(String titular,String equip){
        super(titular);
        this.equip=equip;
    }

    public float calcularPreuNoticia() {
        float preu = 100f;
        if(equip.equalsIgnoreCase("Honda")||equip.equalsIgnoreCase("Yamaha")){preu+=50f;}
        super.setPreu(preu);
        return preu;
    }

    public float calcularPuntuacio() {
        float punts=3;
        if(equip.equalsIgnoreCase("Honda")||equip.equalsIgnoreCase("Yamaha")){punts+=3f;}
        super.setPuntuacio(punts);
        return punts;
    }
}
