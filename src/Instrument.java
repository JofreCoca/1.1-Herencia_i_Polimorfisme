public abstract class Instrument {

    private String nom;
    private float preu;

    public Instrument(String nom, float preu){
        this.nom=nom;
        this.preu=preu;
    }

    public String getNom() {
        return this.nom;
    }

    public float getPreu() {
        return this.preu;
    }

    public abstract void tocar();

    static{
        System.out.println("Està sonant un instrument de vent");
    }
}
