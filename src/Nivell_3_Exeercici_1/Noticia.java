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

    public String getTitular() {
        return titular;
    }

    public String getText() {
        return text;
    }

    public void setPuntuacio(float puntuacio) {
        this.puntuacio = puntuacio;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public abstract float calcularPreuNoticia();

    public abstract float calcularPuntuacio();

    public String toString() {
        return "Noticia{" +
                "titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                ", puntuacio=" + puntuacio +
                ", preu=" + preu +
                '}';
    }
}
