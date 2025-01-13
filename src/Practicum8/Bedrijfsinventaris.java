package Practicum8;

import java.util.ArrayList;

public class Bedrijfsinventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public Bedrijfsinventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
        alleGoederen = new ArrayList<Goed>();
    }

    public void schafAan(Goed g) {
        System.out.printf("Het goed: %s%n", g.toString());
        System.out.printf("Het budget: %s%n", Utils.euroBedrag(budget, 1));
        if (budget - g.huidigeWaarde() >= 0 && !alleGoederen.contains(g)) {
            budget -= g.huidigeWaarde();
            alleGoederen.add(g);
            System.out.println("Aankoop geslaagd.\n");
        }
        else if (alleGoederen.contains(g)) {
            System.out.println("Het goed is al aangeschaft.\n");
        }
        else {
            System.out.println("Het budget is niet toereikend.\n");
        }
    }

    public String toString() {
        String message = "";
        for (Goed g : alleGoederen) {
            message += g.toString() + "\n";
        }
        message += String.format("\nHet overige budget is %s", Utils.euroBedrag(budget, 1));
        return message;
    }
}
