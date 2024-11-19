
public class Main {

    public static void main(String[] args) {

        InstrumentVent instrumentVent=new InstrumentVent("Flauta",20);
        InstrumentCorda instrumentCorda=new InstrumentCorda("Guitarra",150);
        InstrumentPercussio instrumentPercussio=new InstrumentPercussio("Batería",400);

        instrumentVent.tocar();
        instrumentCorda.tocar();
        instrumentPercussio.tocar();
    }
}