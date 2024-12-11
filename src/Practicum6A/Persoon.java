package Practicum6A;

import java.util.ArrayList;

public class Persoon {

    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
        this.mijnGames = new ArrayList<>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (!mijnGames.contains(g) && budget - g.huidigeWaarde() >= 0) {
            budget = budget - g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (!koper.mijnGames.contains(g) && koper.budget - g.huidigeWaarde() >= 0 && mijnGames.contains(g)) {
            koper.budget = koper.budget - g.huidigeWaarde();
            koper.mijnGames.add(g);
            mijnGames.remove(g);
            budget = budget + g.huidigeWaarde();
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        String message = "";
        for (Game game : mijnGames) {
            message += "\n" + game;
        }

        return String.format("%s heeft een budget van €%.2f en bezit de volgende games:%s", naam, budget, message);
    }

}