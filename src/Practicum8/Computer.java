package Practicum8;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    public double huidigeWaarde() {
        double nieuwePrijs = aanschafPrijs;
        for (int i = 0; i < 2025 - productieJaar; i++) {
            nieuwePrijs *= 0.6;
        }
        nieuwePrijs = Math.round(nieuwePrijs * 10) / 10.0;
        return nieuwePrijs;
    }

    public boolean equals(Object obj) {
        boolean zelfdeComputer = false;
        if (obj instanceof Computer) {
            if (this.macAdres.equals(((Computer) obj).macAdres)
                    && this.type.equals(((Computer) obj).type)
                    && this.aanschafPrijs == ((Computer) obj).aanschafPrijs
                    && this.productieJaar == ((Computer) obj).productieJaar) {
                zelfdeComputer = true;
                return zelfdeComputer;
            }
        }
        return zelfdeComputer;
    }

    public String toString() {
        return String.format("Computer: %s is gebouwd in het jaar %d met MacAdres van %s en heeft een waarde van: €%.1f", type, productieJaar, macAdres, huidigeWaarde());
    }
}


