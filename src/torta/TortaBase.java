package torta;

public class TortaBase implements Torta{
    protected String name;

    public TortaBase(String name) {
        this.name = name;
    }

    @Override
    public String prepara() {
        return "Torta " + name + " preparata";
    }
}
