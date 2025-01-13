package Practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }
    public boolean equals(Object obj) {
        return this.type.equals(((Voertuig) obj).type)
                && this.nieuwprijs == ((Voertuig) obj).nieuwprijs
                && this.bouwjaar == ((Voertuig) obj).bouwjaar;
    }

    public String toString() {
        return String.format("Voertuig: %s met bouwjaar %d heeft een waarde van: %s",
                type,
                bouwjaar,
                Utils.euroBedrag(huidigeWaarde()));
    }
}
