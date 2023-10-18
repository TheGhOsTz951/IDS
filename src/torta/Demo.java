package torta;

public class Demo {
    public static void main(String[] args) {
        Torta torta = new CanditiDecorator(new GlassaCioccoDecorator(new TortaBase("Napoli")));
        System.out.println(torta.prepara());

        Torta torta1 = new GlassaCioccoDecorator(new CanditiDecorator(new TortaBase("Milano")));
        System.out.println(torta1.prepara());
    }
}
