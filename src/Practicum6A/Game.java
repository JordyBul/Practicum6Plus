package Practicum6A;

import java.time.LocalDate;

public class Game {

    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }


    public double huidigeWaarde() {
        double nieuwePrijs = nieuwprijs;
        for (int i = 0; i < LocalDate.now().getYear() - releaseJaar; i++) {
            nieuwePrijs *= 0.7;
        }
        return nieuwePrijs;
    }

    public boolean equals(Object andereObject) {
        boolean dezelfdeGames = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar) {
                dezelfdeGames = true;
            }
        }
        return dezelfdeGames;
    }

    public String toString() {
        return String.format("%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f", naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }

}
