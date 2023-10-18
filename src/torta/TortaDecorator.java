package torta;

public class TortaDecorator implements Torta {
    protected Torta torta;

    public TortaDecorator(Torta tortaDecorator){
        this.torta = tortaDecorator;
    }

    @Override
    public String prepara() {
        return torta.prepara();
    }
}
