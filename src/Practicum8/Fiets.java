package Practicum8;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        double nieuwePrijs = nieuwprijs;
        for (int i = 0; i < 2025 - bouwjaar; i++) {
            nieuwePrijs *= 0.9;
        }
        nieuwePrijs = Math.round(nieuwePrijs * 10) / 10.0;
        return nieuwePrijs;
    }

    public boolean equals(Object obj) {
        boolean zelfdeFiets = false;
        if (obj instanceof Fiets) {
            if (this.framenummer == ((Fiets) obj).framenummer) {
                return super.equals(obj);
            }
            return zelfdeFiets;
        }
        return zelfdeFiets;
    }
}
