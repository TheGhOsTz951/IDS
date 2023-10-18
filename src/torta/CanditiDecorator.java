package torta;

public class CanditiDecorator extends TortaDecorator {
    private String string = " con canditi";

    public CanditiDecorator(Torta torta) {
        super(torta);
    }

    @Override
    public String prepara() {
        return super.prepara() + string;
    }
}
