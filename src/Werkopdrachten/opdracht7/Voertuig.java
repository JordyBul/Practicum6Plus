package Werkopdrachten.opdracht7;

public class Voertuig {
    private String merk;
    private String type;

    public Voertuig() {
        this("onbekend", "onbekend");
    }

    public Voertuig(String merk) {
        this(merk, "onbekend");
    }

    public Voertuig(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    public String toString() {
        return String.format("Merk: %s, type: %s", merk, type);
    }
}
