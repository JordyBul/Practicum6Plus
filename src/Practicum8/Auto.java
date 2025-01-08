package Practicum8;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde() {
        double nieuwePrijs = nieuwprijs;
        for (int i = 0; i < 2025 - bouwjaar; i++) {
            nieuwePrijs *= 0.7;
        }
        nieuwePrijs = Math.round(nieuwePrijs * 10) / 10.0;
        return nieuwePrijs;
    }

    public boolean equals(Object obj) {
        boolean zelfdeAuto = false;
        if (obj instanceof Auto) {
            if (this.kenteken.equals(((Auto) obj).kenteken)) {
                return super.equals(obj);
            }
        }
        return zelfdeAuto;
    }
}
