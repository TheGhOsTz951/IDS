package torta;

public class GlassaCioccoDecorator extends TortaDecorator{
    private final String string = " con glassa al cioccolato";

    public GlassaCioccoDecorator(Torta torta){
        super(torta);
    }

    @Override
    public String prepara() {
        return super.prepara() + string;
    }
}
