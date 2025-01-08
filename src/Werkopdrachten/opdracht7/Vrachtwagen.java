package Werkopdrachten.opdracht7;

public class Vrachtwagen extends Voertuig {
    private int laadvermogen;

    public Vrachtwagen() {
        this("onbekend", 0);
    }

    public Vrachtwagen(String merk, int laadvermogen) {
        this(merk, "onbekend", laadvermogen);
    }

    public Vrachtwagen(String merk, String type, int laadvermogen) {
        super(merk, type);
        this.laadvermogen = laadvermogen;
    }

    public String toString() {
        return String.format("Vrachtwagen. %s, met een laadvermogen van %d ton", super.toString(), laadvermogen);
    }

}
